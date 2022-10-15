package variable

fun main() {
    val number: Int = 1
    println(number)

    var number1 = 10L

    val number2 = 10L

    var number3: Long? = 1000L // null이 들어가려면 타입 옆에 ?를 붙여야 함
    number3 = null

    var person = Person("sangdee")
}