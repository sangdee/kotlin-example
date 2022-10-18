package classes

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("avante",1000L)
class Sonata : HyundaiCar("sonata",2000L)
class Grandeur : HyundaiCar("grandeur",3000L)

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}