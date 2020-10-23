package com.ideabaker.samples.polymorphism.web.request

import com.ideabaker.samples.polymorphism.model.RecurrenceType

interface Request {
  val recurrenceType: RecurrenceType
  val values: List<String>
}