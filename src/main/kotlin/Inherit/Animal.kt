package Inherit

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int,
) {
    abstract fun move()

}

class Cat(
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("Not yet implemented")
    }
}

class Penguin(
    species: String,
) : Animal(species, 2), Swimable, Flyable {
    private val wingCount: Int = 2
    override fun move() {
        println("Not yet implemented")
    }

    override val legCount: Int
        get() = super.legCount + this.legCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}

interface Swimable {
    val swimAbility: Int
        get() = 3

    fun act() {
        println("swimable")
    }
}

interface Flyable {
    fun act() = println("")
}