package com.example.kotlinstudy.string

fun main() {
  stringTemplate()
  expressionTemplate()
  tripleQuotes()
}

fun stringTemplate() {
  val variable = 123
  println("variable = $variable")
  println("variable = $1") // 변수가 아니라서 바인딩 안됨
}

fun expressionTemplate() {

  val boolean = true
  println("boolean = ${if (boolean) "참" else "거짓"}")
  
}

fun tripleQuotes() {

  val name = "심현섭"
  val text = """
    1 안녕하세요
    1 이건
    1 triple quotes 인데요
    1 "$name"
  """.trimIndent()
  
  val text2 = "안녕하세요 \"$name\" "
  
  println(text)
  println(text2)
}