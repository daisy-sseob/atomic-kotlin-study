package com.example.kotlinstudy.data

class BusinessException(val errorCode: ErrorCode) : RuntimeException(errorCode.name) {
  
}

enum class ErrorCode{
  
  BOOK_NOT_FOUND,
  
}