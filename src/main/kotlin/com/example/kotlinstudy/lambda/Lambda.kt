package com.example.kotlinstudy.lambda

import com.example.kotlinstudy.`object`.Person

fun main() {
  val list = listOf(
    Person("심현섭", 31),
    Person("심광섭", 40),
    Person("심광섭", 40),
    Person("심광섭", 40),
    Person("심효섭", 54),
    Person("심효섭", 53),
    Person("심효섭", 5),
    Person("심효섭", 51)
  )
  
  // 중괄호로 감싸진 람다식
  val isOlderThan40 = { person: Person -> person.age > 40 }
  
  // function body를 생략한 lambda
  val isHyunseob = fun(person: Person) = person.name == "심현섭"
  
  // function body가 존재하는 lambda
  val isGwangseob = fun(person: Person): Boolean {
    return person.name == "심광섭"
  }

  val filteredPerson = filterPerson(persons = list, filter = { person: Person -> person.age > 53 })
  
  println(filteredPerson)
  
  println(filterPerson({ it.age > 52 }, list))
  
  println(filterPerson2(list){ it.age > 52 })
  
  println(
    filterPerson2(list, fun(person: Person): Boolean {
      return person.age > 52
    })
  )
  
}

fun filterPerson(filter: (Person) -> Boolean, persons: List<Person> ): List<Person> {
  return persons.stream()
    .filter(filter)
    .toList()
}

fun filterPerson2(persons: List<Person>, filter: (Person) -> Boolean): List<Person> {
  return persons.stream()
    .filter(filter)
    .toList()
}
