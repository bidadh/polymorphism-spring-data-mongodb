package com.ideabaker.samples.polymorphism.web

import com.ideabaker.samples.polymorphism.model.DayOfWeek
import com.ideabaker.samples.polymorphism.model.EveryType
import com.ideabaker.samples.polymorphism.model.RecurrenceType

class MonthlyRequest(
  override val recurrenceType: RecurrenceType = RecurrenceType.Monthly,
  override val values: List<String>,
  val every: EveryType,
  val dayOfWeek: List<DayOfWeek>
): RecurrenceRequest(), Request