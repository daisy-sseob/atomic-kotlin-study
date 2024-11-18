package com.example.kotlinstudy.datatype

fun main() {
  println("test" + 6.8)

  val n = 1
  var p = 1.2

  val number: Int = 1
  var point: Double = 1.2
  val bool: Boolean = true
  val words: String = "hello" 
  val char: Char = 'z'
  
  // raw string !
  val lines: String = """ 
    첫
    둘
    셋 줄 테스트 => ${words}
  """.trimIndent()
  
  println(n)
  println(p)
  println(number)
  println(point)
  println(bool)
  println(words)
  println(char)
  println(lines)
  
}