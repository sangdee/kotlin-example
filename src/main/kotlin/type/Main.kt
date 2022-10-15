package type

import variable.Person

/**
 * Any -> Object
 * Unit -> void
 * Nothing -> 무조건 예외를 반환하는 함수
 */
fun main() {
    printNameIfPresentNull(null)

    val person = Person("sangdee")
    println("name : ${person.name}")

    val trimIndent = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()
    println(trimIndent)

    println("${trimIndent[0]}${trimIndent[2]}")
}

fun printNameIfPresent(obj: Any) {
    if (obj is Person) {
//        val person = obj as Person
//        println(person)
        println(obj.name)
    }
    if (obj !is Person) {

    }
}

fun printNameIfPresentNull(obj: Any?) {
    val person = obj as? Person
    println(person?.name)
}