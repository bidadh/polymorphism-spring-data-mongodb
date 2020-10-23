package com.ideabaker.samples.polymorphism.web

import com.ideabaker.samples.polymorphism.model.RecurrenceType

class CustomRequest(
  override val recurrenceType: RecurrenceType = RecurrenceType.Custom,
  override val values: List<String>
): RecurrenceRequest(), Request