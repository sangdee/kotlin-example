package `fun`

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
) {

}

fun main() {
    val fruits = listOf(
        Fruit(1, "ㅂ", 1, 1), Fruit(1, "ㅂ", 1, 1),
        Fruit(1, "ㅂ", 1, 1), Fruit(1, "ㅂ", 1, 1)
    )

    val apples = fruits.filter { fruit -> fruit.name == "ㅂ" }
    val applesAll = fruits.all { fruit -> fruit.name == "ㅂ" }
    val applesNone = fruits.none { fruit -> fruit.name == "ㅂ" }
    fruits.sortedBy { fruit -> fruit.name }
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val associateBy: Map<Long, Fruit> =
        fruits.associateBy { fruit -> fruit.id } // value에 단일 객체가 들어감
    fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })
        .filter { (key, value) -> key == "사과" }

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "ㅂ", 1, 1), Fruit(1, "ㅂ", 1, 1),
            Fruit(1, "ㅂ", 1, 1), Fruit(1, "ㅂ", 1, 1)
        ),
        listOf(
            Fruit(1, "ㅂ", 1, 1), Fruit(1, "ㅂ", 1, 1),
            Fruit(1, "ㅂ", 1, 1), Fruit(1, "ㅂ", 1, 1)
        )
    )

    fruitsInList.flatten()//List<List<Fruit>> -> List<Fruit>
}