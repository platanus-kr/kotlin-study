package functions

/**
 * 필터와 맵
 *
 * 다양한 컬랙션 처리 기능
 *
 * List to Map
 */

fun main() {

    val fruits = listOf(
        FruitX(1, "사과", 1_000, 2_000),
        FruitX(2, "바나나", 3_000, 5_000),
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    val apples2 = fruits.filterIndexed { index, fruit ->
        println(index)
        fruit.name == "사과"
    }

    val apples3 = fruits.filter { fruit -> fruit.name == "사과" }
        .map {fruit -> fruit.currentPrice }

//    val apples4 = fruits.filter { fruit -> fruit.name == "사과" }
//        .mapNotNull { fruit -> fruit.nullOrValue() } // 이건 안되는데?

    val apples5 = fruits.all { fruit -> fruit.name == "사과" }

    val apples6 = fruits.none{ fruit -> fruit.name !== "사과" }

    val apples7 = fruits.any{ fruit -> fruit.factoryPrice >= 10_000 }

    val fruitCount1 = fruits.count()

    val fruitCount2 = fruits.sortedBy { fruit -> fruit.currentPrice } // 기본은 오름차순

    val fruitCount3 = fruits.sortedByDescending { fruit -> fruit.currentPrice }

    val fruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    val firstFruit = fruits.first()
    val firstFruitOrNull = fruits.firstOrNull()

    val lastFruit = fruits.last()
    val lastFruitOrNull = fruits.lastOrNull()

    val fruitMap: Map<String, List<FruitX>> = fruits.groupBy { fruit -> fruit.name }

    val fruitMapById: Map<Long, FruitX> = fruits.associateBy { fruit -> fruit.id }

    val priceMapByFruit: Map<String, List<Long>> = fruits
        .groupBy({fruit -> fruit.name}, {fruit -> fruit.factoryPrice})

    val priceMapById: Map<Long, Long> = fruits
        .associateBy({fruit -> fruit.id}, {fruit -> fruit.factoryPrice })

    // flatMap, flatten... 생략 .. 너무 많다 자바랑 똑같음.
}


data class FruitX(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
)