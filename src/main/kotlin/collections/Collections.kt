package collections

fun main() {
    val numbers = listOf(100, 220)
    val numbers2 = mutableListOf(100, 200)
    numbers2.add(333)

    val set = setOf(100, 200)

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {

    }
    for ((key, value) in oldMap.entries) {

    }


    for (number in numbers) {
        println(number)
    }
    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

}