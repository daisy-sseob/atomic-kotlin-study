package com.example.kotlinstudy.functions

fun main() {

  varargsFunction(1, 2, 3, 4, 5)

  val intArray = intArrayOf(1, 2, 3, 4, 5)
  varargsFunction(*intArray) // 스프레드 연산자를 사용하여 array를 전달

  val list = listOf(1, 2, 3, 4, 5)
  function(list)
}

fun varargsFunction(vararg numbers:Int) {
  println()
  for (number in numbers) {
    print(number)
  }
}

fun function(numbers: List<Int>) {
  println()
  for (number in numbers) {
    print(number)
  }
}