package com.ideabaker.samples.polymorphism.web.request

import com.ideabaker.samples.polymorphism.model.RecurrenceType

class OneTimeRequest(
  override val recurrenceType: RecurrenceType = RecurrenceType.OneTime,
  override val values: List<String>
): RecurrenceRequest(), Request