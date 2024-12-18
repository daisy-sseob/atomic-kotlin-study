package com.example.kotlinstudy

import com.example.kotlinstudy.lambda.filterPerson
import com.example.kotlinstudy.`object`.Person
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.FileReader
import java.io.IOException
import java.time.LocalDateTime
import kotlin.math.PI

fun main() {

//  val books: List<Book> = listOf(Book("Effective Kotlin", "들국화"), Book(), Book())
//
//  val firstElement = books.firstElement()
//  firstElement?.updateTitle("변경함")
//  println(books)
//  
//  val filteredBooks: List<Book> = books.filter({ book -> book.title == "Effective Kotlin" })
//  val titles: List<String> = books.map({ book -> book.title })
//  val nullableBook: Book? = books.firstOrNull()
//  val book: Book = books.first()
//  val nullableLastBook: Book? = books.lastOrNull()
//  val lastBook: Book = books.last()
//
//  val toList = books.stream().filter({ it.title == "Effective Kotlin" }).toList()
//  toList.firstOrNull()?.updateTitle("테스트");
//  
//  val findBooks = books.filter { it.title == "Effective Kotlin" }
//  findBooks.firstOrNull()?.updateTitle("테스트");

  val defaultBook = createBook()
  val book = createBook("Effective Kotlin", "들국화")
  
  println(defaultBook) // Book(title='default title', author='default author')
  println(book) // Book(title='Effective Kotlin', author='들국화')
  
  
  
  
}


fun createBook(title: String = "default title", author: String = "default author"): Book {
  return Book(title, author)
}



fun filterBook(books: List<Book>, filter: (Book) -> Boolean): List<Book> {
  return books.filter(filter)
    .toList()
}

fun <T> List<T>.firstElement(): T? {
  return this.stream()
    .findAny()
    .orElse(null)
}


fun String?.hasText(): Boolean {
  return this == null || this.isBlank()
}

fun createBook(
  title: String = "default title",
  author: String = "default author",
  publishDate: LocalDateTime,
  totalPage: Int,
  price: Int,
  createDateTime: LocalDateTime,
  createUserId: String): Book {
  
  return Book(title, author)
}

val objectMapper: ObjectMapper = ObjectMapper()

fun toJsonStr(book: Book): String {
  return try {
    objectMapper.writeValueAsString(book)
  } catch (e: JsonProcessingException) {
    throw e
  }
}

fun readFromFile(filePath: String): String {
    return try {
      FileReader(filePath).use { 
        reader -> reader.readText()  // 파일 내용 읽기
      }
    } catch (e: IOException) {
//        log.error("파일을 읽는 중 오류 발생: ${e.message}")
      println("파일을 읽는 중 오류 발생: ${e.message}")
      ""
    }
}
