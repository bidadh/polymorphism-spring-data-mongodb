package com.ideabaker.samples.polymorphism

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@SpringBootApplication
@EnableReactiveMongoRepositories
class PolymorphismSpringDataMongodbApplication

fun main(args: Array<String>) {
  runApplication<PolymorphismSpringDataMongodbApplication>(*args)
}

