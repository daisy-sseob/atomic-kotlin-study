package com.example.kotlinstudy

import com.example.kotlinstudy.data.BookRepository
import java.lang.RuntimeException

class Book(
  var title: String,
  val author: String
) {
  
  constructor() : this("", "")
  
  fun update() {
    println("update book")
  }

  fun updateTitle(s: String) {
    this.title = s
  }

  override fun toString(): String {
    return "Book(title='$title', author='$author')"
  }

}


fun main() {
  val bookRepository = BookRepository()

  val book = bookRepository.findBook(1L) ?: throw RuntimeException("Book Not Found")
  book.update()

}