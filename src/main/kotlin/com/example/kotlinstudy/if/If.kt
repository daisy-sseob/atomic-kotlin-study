package com.example.kotlinstudy.`if`

fun main() {
  if (1 > 0) {
    println("1은 0보다 크다")
  }

  val number = 5
  if (number < 11) {
    println("10은 11보다 작다")
  } else {
    println("아니면 여길 타")
  }

  val boolean: Boolean = 1 >= 1
  if (boolean) {
    println("it's true")
  }

  println(" 5보다 클 경우 ${ifExpression(10)}".trimIndent())
  println(" 5보다 작을 경우 ${ifExpression(3)}".trimIndent())
  ifExpression(if (number > 5) 2 else 3)

  println(oneOrTheOther(true))
  
}

fun ifExpression(num: Int): Int {
  
  return if (num > 5) {
    4
  } else {
    42
  }
  
}

// return 생략 가능
fun oneOrTheOther(exp: Boolean): String =
  if (exp) {
    "True!"
  } else {
    "False!"
  }