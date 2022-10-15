package conditional

import java.lang.IllegalArgumentException
import java.util.IllegalFormatCodePointException

fun main() {
    println(validateScoreIsNotNegative(1))
    println(getPassOrFail(60))
}

fun validateScoreIsNotNegative(score: Int) {
    if (score in 0..100) {
        throw IllegalArgumentException("${score}는 0부터 100이다")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("fdsafsa")
        else -> println("123131")
    }
}