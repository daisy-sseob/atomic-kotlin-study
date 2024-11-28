package com.example.kotlinstudy.collection


fun main() {
  val list = listOf(1, 2, 3, 4, 5)

  println(list.filter { it > 0 }) 
  println(list.map { "${it}현섭" }) 
  println(list.reversed()) 

}