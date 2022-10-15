package operator

/**
 * compareTo ->  >,<,== 로 객체 비교 가능
 */
fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)
    println(money1.amount == money3.amount)
    println(money3.amount)
    println("${money1 === money3}")
    println(money1 == money3)
//    println("money1 == money3 : ${money2 == money3}")
//    println(money1 == money3)

    println(money1 + money3)
}
