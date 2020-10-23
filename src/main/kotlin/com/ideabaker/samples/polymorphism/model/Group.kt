package com.ideabaker.samples.polymorphism.model

import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document

@Document
@TypeAlias("group")
data class Group(
  val name: String,
  val details: RecurrenceDetails
)