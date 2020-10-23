package com.ideabaker.samples.polymorphism.model

import org.springframework.data.annotation.TypeAlias

@TypeAlias("custom")
data class Custom(
  override val recurrenceType: RecurrenceType = RecurrenceType.Custom,
  override val start: String = "Start of Custom Group",
  override val total: Int = 17,
  override val end: String = "End of Custom Group"
): RecurrenceDetails(), GroupType, EndingGroup