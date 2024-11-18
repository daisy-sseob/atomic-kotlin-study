package com.example.kotlinstudy.varandval

fun main() {
  var whole = 11
  var fractional = 1.4
  var words = "테스트"
  println(whole)
  println(fractional)
  println("test ${words} 할게용")

  var sum = 1
  sum = sum + 2
  sum++
  println(sum)

  val immutableSum = 1
//  immutableSum++ 값 변경 불가
  
}