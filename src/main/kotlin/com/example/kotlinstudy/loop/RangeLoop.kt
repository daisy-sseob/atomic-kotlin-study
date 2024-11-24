package com.example.kotlinstudy.loop

fun main() {
  range()
  forRange()
  rangeForParam(1..100)
  rangeForParam('ㄱ'..'ㅎ')
  rangeForParam('a'..'z')
  rangeForParam('A'..'Z')
  strLasIndex("Hello")
  
  // 단순 반복하고 싶을 때
  repeat(2) {
    println("hello !!")
  }
}

fun range() {
  val oneToTen = 1..10
  val oneToNine: IntRange = 1 until 10

  println(oneToTen) 
  println(oneToNine)
  
}

fun forRange() {
  for (i in 1..10) {
    print(i)
  }

  println()
  for (i in 0 until 10) {
    print(i)
  }

  println()
  for (i in 0 ..< 10) {
    print(i)
  }
  
}

fun rangeForParam(range: IntRange) {
  
  println()
  for (i in range) {
    print(i)
  }
  
}

fun rangeForParam(range: CharProgression) {
  
  println()
  for (i in range) {
    print(i)
  }
  
}

fun strLasIndex(str: String) {
  
  println()
  for (i in 0..str.lastIndex) {
    print(str[i])
  }
  
}