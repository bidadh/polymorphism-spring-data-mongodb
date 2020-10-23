package com.ideabaker.samples.polymorphism.web.request

import com.ideabaker.samples.polymorphism.model.RecurrenceType

class DailyRequest(
  override val recurrenceType: RecurrenceType = RecurrenceType.Daily,
  override val values: List<String>
): RecurrenceRequest(), Request