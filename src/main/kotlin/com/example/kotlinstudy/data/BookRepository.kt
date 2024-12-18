package com.example.kotlinstudy.data

import com.example.kotlinstudy.Book

class BookRepository {
  
  fun findBook(id: Long): Book? {
    return Book("title", "author")
  }
  
}