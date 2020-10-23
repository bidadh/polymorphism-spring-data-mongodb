package com.ideabaker.samples.polymorphism.model

import org.springframework.data.annotation.TypeAlias

@TypeAlias("weekly")
data class Weekly(
  override val recurrenceType: RecurrenceType = RecurrenceType.Weekly,
  override val start: String = "Start of Weekly Group",
  override val total: Int = 20,
  override val end: String = "End of Weekly Group",
  val every: Int = 1,
  override val dayOfWeek: List<DayOfWeek> = listOf(DayOfWeek.Fri)
): RecurrenceDetails(), GroupType, EndingGroup, RepeatableGroup

