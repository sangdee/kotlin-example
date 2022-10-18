package `fun`

/**
 * 확장함수와 멤버함수의 메서드 명이 같으면 멤버함수 호출
 */
fun main() {
    val str = "ABC"
    println(str.lastChar())

    val train: Train = Train()
    train.isExpensive()//Train 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive()//Train 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive()//Srt 확장함수

    3.add(4)
    3.add2(4)
    3 add2 4

}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

open class Train(
    val name: String = "train",
    val price: Int = 5000

)

fun Train.isExpensive(): Boolean {
    println("expend fun")
    return this.price >= 10000
}

class Srt : Train("SRT", 40000)

fun Srt.isExpensive(): Boolean {
    println("srt")
    return this.price >= 10000
}

fun Int.add(other: Int): Int {
    return this + other
}
infix fun Int.add2(other: Int): Int {
    return this + other
}
