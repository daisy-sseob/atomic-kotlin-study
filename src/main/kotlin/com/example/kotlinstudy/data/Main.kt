package com.example.kotlinstudy.data

import com.example.kotlinstudy.Book
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper


val bookRepository = BookRepository()




//fun main() {
//  bookRepository.findBook(1L)
//    ?.updateTitle("new title")
//}

fun main() {
  
  val message = """
        Hello, World!
        "안녕하십니까 ? 
        Java 개발자가 생각하는 Kotlin 장점은 무엇인가요 ?
        Kotlin은 Java보다 간결하고 실용적이라고 생각합니다.
  """.trimIndent()
  
  println(message)
  
}

fun main2() {
  val book = (bookRepository.findBook(1L)
    ?: throw BusinessException(ErrorCode.BOOK_NOT_FOUND))

  book.updateTitle("new title")
  
  val num = 5
  print(num in 5..10) // true

  val bookType: BookType = BookType.PAPER
  
  when(bookType){
    BookType.PAPER -> println("one")
    BookType.EBOOK -> println("two")
    BookType.AUDIO -> println("other")
  }
  
}

fun handleBook1(bookType: BookType): Book {
  return when(bookType){
    BookType.PAPER -> handlePaperBook()
    BookType.EBOOK -> handleEbook()
    BookType.AUDIO -> handleAudio()
  }
}

fun handleBook2(bookType: BookType): Book {
  return when(bookType){
    BookType.PAPER -> handlePaperBook()
    BookType.EBOOK -> handleEbook()
    else -> handleEtc()
  }
}

fun handle2(bookType: BookType) {
  when(bookType){
    BookType.PAPER -> handlePaperBook()
    else -> handleEtc()
  }
}

fun handleEtc(): Book {
  return Book("title", "author")
}

fun handlePaperBook(): Book {
  return Book("title", "author")
}
fun handleEbook(): Book {
  return Book("title", "author")
}
fun handleAudio(): Book {
  return Book("title", "author")
}
