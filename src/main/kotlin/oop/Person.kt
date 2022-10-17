package oop

import java.lang.IllegalArgumentException

fun main() {
    val person = Person("이상지", 100)
    print(person.name)
    person.age = 10
    println(person.age)

    val person1 = Person("이상지")
    println("${person1.age}  ${person.name}")

    val person2 = Person.of("test")
    println(person2.age)
    println(person2.name)

    println(person2.isAdult)
}


class Person(
    name: String,
    var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }
    var name = name
        set(value){
            field = value.uppercase()
        }

    val uppercaseName: String
        get() = this.name.uppercase()

    constructor(name: String) : this(name, 1) {
        println("constructor 1")
    }

    constructor() : this("test") {
        println("constructor 2")
    }

    companion object {
        fun of(s: String): Person {
            return Person(s, 1)
        }
    }

    val isAdult: Boolean
        get() = age >= 20

}
