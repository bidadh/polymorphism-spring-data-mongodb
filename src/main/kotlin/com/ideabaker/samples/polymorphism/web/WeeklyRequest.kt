package com.ideabaker.samples.polymorphism.web

import com.ideabaker.samples.polymorphism.model.DayOfWeek
import com.ideabaker.samples.polymorphism.model.RecurrenceType

class WeeklyRequest(
  override val recurrenceType: RecurrenceType = RecurrenceType.Weekly,
  override val values: List<String>,
  val every: Int,
  val dayOfWeek: List<DayOfWeek>
): RecurrenceRequest(), Request