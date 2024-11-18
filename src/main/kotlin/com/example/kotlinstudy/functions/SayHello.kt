package com.example.kotlinstudy.functions

fun main() :Unit{
  sayHello()
  sayGoodbye()
  println(multiplyByThree(10))
  println(multiplyByFour(10))
}

fun sayHello() {
  println("Hello, Kotlin")
}

fun sayGoodbye() {
  println("Goodbye, Kotlin")
}

fun multiplyByThree(number: Int): Int = number * 3
fun multiplyByFour(number: Int) = number * 4
