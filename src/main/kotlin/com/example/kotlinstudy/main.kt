package com.example.kotlinstudy

import com.example.kotlinstudy.`object`.Person

fun main() {

  val person = Person(name = "심현섭", age = 30)
  println(person)
  
  person.age = 91
  println(person)
  
  println(person.age)
  
  val person2 = Person(name = "1살짜리 심현섭")
  println(person2)

  println(person.age)
  println(person.isAdult())
  println(person.isAdult2)
  
}