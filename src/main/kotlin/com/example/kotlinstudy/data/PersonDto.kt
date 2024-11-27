package com.example.kotlinstudy.data

data class PersonDto(
  val name: String,
  val age: Int
) {

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is PersonDto) return false
    if (name != other.name) return false
    return true
  }

  override fun hashCode(): Int {
    return name.hashCode()
  }
}


fun main() {

  val personDto = PersonDto("심현섭", 30)
  println(personDto)
  println("equals 1 -> ${personDto.equals(PersonDto("심현섭", 30))}") 
  println("equals 2 -> ${personDto.equals(PersonDto("심현섭", 31))}") 
  println("hashcode 1 -> ${personDto.hashCode()}") 
  println("hashcode 2 -> ${PersonDto("심현섭", 31).hashCode()}") 
  
}