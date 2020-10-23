package com.ideabaker.samples.polymorphism.web

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "recurrenceType")
@JsonSubTypes(
  JsonSubTypes.Type(value = OneTimeRequest::class, name = "OneTime"),
  JsonSubTypes.Type(value = DailyRequest::class, name = "Daily"),
  JsonSubTypes.Type(value = WeeklyRequest::class, name = "Weekly"),
  JsonSubTypes.Type(value = MonthlyRequest::class, name = "Monthly"),
  JsonSubTypes.Type(value = CustomRequest::class, name = "Custom")
)
abstract class RecurrenceRequest