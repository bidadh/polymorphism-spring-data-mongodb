package com.ideabaker.samples.polymorphism.model.type

import com.ideabaker.samples.polymorphism.model.DayOfWeek
import com.ideabaker.samples.polymorphism.model.EveryType
import com.ideabaker.samples.polymorphism.model.RecurrenceType
import org.springframework.data.annotation.TypeAlias

@TypeAlias("monthly")
data class Monthly(
  override val recurrenceType: RecurrenceType = RecurrenceType.Monthly,
  override val start: String = "Start of Monthly Group",
  override val total: Int = 5,
  override val end: String = "End of Monthly Group",
  val every: EveryType = EveryType.Last,
  override val dayOfWeek: List<DayOfWeek> = listOf(DayOfWeek.Sun)
): RecurrenceDetails(), GroupType, EndingGroup, RepeatableGroup