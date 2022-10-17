package `object`

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            print("move")
        }

        override fun fly() {
            println("flty")
        }

    })
}

class Person private constructor(
    var name: String,
    var age: Int,
) {
    companion object {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}

private fun moveSomething(movable: Movable) {
    movable.move()

    movable.fly()
}