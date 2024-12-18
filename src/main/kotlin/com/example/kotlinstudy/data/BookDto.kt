package com.example.kotlinstudy.data

class BookImpl : BookInterface {

  override fun printBookInfo() {
    TODO("Not yet implemented")
  }
  
}

class Bird : Flyable {
  override fun fly() {
    // fly logic
  }
}

data class BookDto(
  val title: String,
  val author: String
)

fun main() {
  val bookDto1 = BookDto("Effective Kotlin", "들국화")
  val bookDto2 = BookDto("Effective Kotlin", "들국화")
  var bookDto3 = bookDto2.copy(author = "수정된 작가")
  
  println(bookDto1)
  println(bookDto3)
  println(bookDto1.equals(bookDto2))
  println(bookDto1.equals(bookDto3))
  
}