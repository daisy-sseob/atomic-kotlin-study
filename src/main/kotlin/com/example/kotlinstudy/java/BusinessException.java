package com.example.kotlinstudy.java;

public class BusinessException {

  public BusinessException(ErrorCode errorCode) {
  }
  
  public enum ErrorCode{
    BOOK_NOT_FOUND,
    
  }
}
