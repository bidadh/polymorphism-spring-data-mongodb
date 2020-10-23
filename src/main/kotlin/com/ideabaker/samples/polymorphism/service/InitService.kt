package com.ideabaker.samples.polymorphism.service

import com.ideabaker.samples.polymorphism.model.Custom
import com.ideabaker.samples.polymorphism.model.Daily
import com.ideabaker.samples.polymorphism.model.Group
import com.ideabaker.samples.polymorphism.model.Monthly
import com.ideabaker.samples.polymorphism.model.OneTime
import com.ideabaker.samples.polymorphism.model.Weekly
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.EventListener
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.core.query.Query

@Configuration
class InitService (private val mongoTemplate: ReactiveMongoTemplate) {
  @EventListener(ApplicationReadyEvent::class)
  fun ready() {
    mongoTemplate.count(Query(), Group::class.java)
      .filter { it == 0L }
      .flatMapMany {
        val groups: List<Group> = arrayListOf(
          Group("oneTime", OneTime()),
          Group("daily", Daily()),
          Group("weekly", Weekly()),
          Group("bi-weekly", Weekly(start = "Start of bi-Weekly Group", every = 2)),
          Group("monthly", Monthly()),
          Group("custom", Custom())
        )
        mongoTemplate.insert(groups, Group::class.java)
      }
      .collectList()
      .subscribe {
        println("******************************************************************************")
        println("******************************************************************************")
        println("******************************************************************************")
        println("******************************************************************************")
        println("******************************************************************************")
        println(it)
        println("******************************************************************************")
        println("******************************************************************************")
        println("******************************************************************************")
        println("******************************************************************************")
        println("******************************************************************************")
      }
  }
}