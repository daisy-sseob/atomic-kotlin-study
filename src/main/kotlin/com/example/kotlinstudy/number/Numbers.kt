package com.example.kotlinstudy.number

fun main() {

  val million = 1_000_000 // Int type 추론
  println(million)
  println(million is Int)
  println()
  test(string = "안녕", int = 1_000_000)
  test(int = 123, string = "안녕")

  integerOverflow()
  integerOverflowUsingLong()
}

fun test(string: String, int: Int) {
  println("$string $int")
}

fun integerOverflow() {
  val i = Int.MAX_VALUE
  println(i + i)
}

fun integerOverflowUsingLong() {
  val i = Int.MAX_VALUE
  println(0L + i + i)
}