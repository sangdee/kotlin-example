package `fun`

import classes.PersonDto

data class Person(
    val name: String,
    val age: Int
) {
    fun getNumberOrNull(): Int? {
        return age.takeIf { it > 0 } // 0초과면 =age 반환 아니면 null 반환
    }
}

fun main() {
    val person = Person("sa", 100)
    val (name, age) = person //필드 순서대로 들어갑니다 순서 바뀌면 거꾸로 들어감
    println("$name, $age")
    val value1 = person.let {
        it.age
    }
    val value2 = person.run{
        this.age
    }
    val value3 = person.also {
        it.age
    }
    val value4 = person.apply {
        this.age
    }

    val personDto = with(person) {
        PersonDto(
            name = name,
            age = age,
        )
    }
}

fun printPerson(person: Person?) {
    person?.let { // T -> R 람다에서는 가장 마지막에 있는 것이 리턴값
        println(it.name)
        println(it.age)
    }
}


