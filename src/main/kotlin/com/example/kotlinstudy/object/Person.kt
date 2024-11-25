package com.example.kotlinstudy.`object`
/*
* primary constructor 주 생성자. 반드시 존재해야 한다.
* 생성자 parameter가 없을 경우 생략 가능.
* */
class Person(
  val name: String = "default_현섭",
  var age: Int = 110
){ 
  
  init { // 객체 생성시 init 블럭이 호출된다.
    if (age < 0) {
      throw IllegalArgumentException("나이는 0보다 작을 수 없습니다.")
    }
  }
  
  // secondary constructor 부 생성자. 부 생성자 보다는 default parameter를 추천한다.
  constructor(name: String) : this(name, 1)
  
  fun isAdult() = age >= 20
  val isAdult2 get() = age >= 20
  
  override fun toString(): String {
    return "Person(name=$name, age=$age)"
  }
  
}

