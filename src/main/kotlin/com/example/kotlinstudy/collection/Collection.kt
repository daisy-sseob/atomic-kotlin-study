package com.example.kotlinstudy.collection


fun main() {
  val list = listOf(1, 2, 3, 4, 5)

  val word = "단어"
  val lines: String = """ 
          "첫" 
          "둘"
          셋 줄 테스트 => ${word}
  """.trimIndent()
  
  println(lines)
  
}

