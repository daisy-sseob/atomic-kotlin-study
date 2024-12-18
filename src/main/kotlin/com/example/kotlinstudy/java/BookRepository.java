package com.example.kotlinstudy.java;


import java.util.Optional;

public class BookRepository {
  
  public Optional<Book> findBook(Long id) {
    return Optional.ofNullable(new Book());
  }
  
}