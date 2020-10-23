package com.ideabaker.samples.polymorphism.model.type

import com.ideabaker.samples.polymorphism.model.RecurrenceType
import org.springframework.data.annotation.TypeAlias

@TypeAlias("daily")
data class Daily(
  override val recurrenceType: RecurrenceType = RecurrenceType.Daily,
  override val start: String = "Start of Daily Group",
  override val total: Int = 10,
  override val end: String = "End of Daily Group"
): RecurrenceDetails(), GroupType, EndingGroup