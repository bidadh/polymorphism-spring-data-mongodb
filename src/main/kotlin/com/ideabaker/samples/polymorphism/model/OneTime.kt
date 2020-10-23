package com.ideabaker.samples.polymorphism.model

import org.springframework.data.annotation.TypeAlias

@TypeAlias("oneTime")
class OneTime(
  override val recurrenceType: RecurrenceType = RecurrenceType.OneTime,
  override val start: String = "Start of OneTime Group",
  override val total: Int = 1
): RecurrenceDetails(), GroupType