package com.ideabaker.samples.polymorphism.model.type

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "recurrenceType")
@JsonSubTypes(
  JsonSubTypes.Type(value = OneTime::class, name = "OneTime"),
  JsonSubTypes.Type(value = Daily::class, name = "Daily"),
  JsonSubTypes.Type(value = Weekly::class, name = "Weekly"),
  JsonSubTypes.Type(value = Monthly::class, name = "Monthly"),
  JsonSubTypes.Type(value = Custom::class, name = "Custom")
)
abstract class RecurrenceDetails