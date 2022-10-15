package nullalble

import java.lang.IllegalArgumentException

fun main() {
    val str: String? = null
    println(str?.length ?: 0)

    startsWith("1")

//    val person = Person("sangdee")
//    startsWithA(person.name)

}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA(str: String): Boolean {
    return str!!.startsWith("A") // 절대 null이 아닌 경우 !!
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A") // 절대 null이 아닌 경우 !!
}