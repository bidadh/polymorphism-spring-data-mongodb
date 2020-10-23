package com.ideabaker.samples.polymorphism.web

import com.ideabaker.samples.polymorphism.model.Group
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

/**
 *
 * @author Arthur Kazemi<bidadh@gmail.com>
 * @since 23/10/20 14:12
 */
@Configuration
class RoutesConfig(private val mongoTemplate: ReactiveMongoTemplate) {
  @Bean
  fun groupRouter() = router {
    GET("/groups") {
      mongoTemplate.findAll(Group::class.java)
        .collectList()
        .flatMap { ServerResponse.ok().bodyValue(it) }
    }

    POST("/groups") { request ->
      request.bodyToMono(Group::class.java)
        .flatMap { mongoTemplate.insert(it) }
        .flatMap { ServerResponse.ok().bodyValue(it) }
    }

    POST("/create") { request ->
      request.bodyToMono(RecurrenceRequest::class.java)
        .flatMap { ServerResponse.ok().bodyValue(it) }
    }
  }
}