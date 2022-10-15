package function

import javax.print.DocFlavor.STRING

fun main() {
    repeat("Hello World", 10 , true)
    repeat("Hello World", useNewLine = false)
    repeat("Hello World")

    printNameAndGender(name = "sangdee" , gender = "MALE")

    printAll("a", "b", "c")

    val array = arrayOf("a", "b", "c")
    printAll(*array)
}
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        }else{
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name + gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}