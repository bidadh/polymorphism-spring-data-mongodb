package com.ideabaker.samples.polymorphism.model.type

import com.ideabaker.samples.polymorphism.model.RecurrenceType

interface GroupType {
  val recurrenceType: RecurrenceType
  val start: String
  val total: Int
}