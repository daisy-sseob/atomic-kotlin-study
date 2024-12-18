package com.example.kotlinstudy.java;

import org.springframework.http.HttpStatus;

public class Main2 {

  public static void main(String[] args) {
    
    String message = "" +
            "Hello, World!\n" +
            "안녕하십니까 ? \n" +
            "Java 개발자가 생각하는 Kotlin 장점은 무엇인가요 ?\n" +
            "Kotlin은 Java보다 간결하고 실용적이라고 생각합니다.\n";

    System.out.println(message);
    
  }
  
  public String isSuccess(HttpStatus httpStatus) {
    if (httpStatus == HttpStatus.OK) {
      return "success";
    } else {
      return "fail";
    }
  }
  
  public String isSuccess2(HttpStatus httpStatus) {
    return (httpStatus == HttpStatus.OK) ? "success" : "fail";
  }
}
