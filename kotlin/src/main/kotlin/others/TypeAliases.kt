package others

import others.misc.Fruit


/**
 * TypeAlias 용법
 */
fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) { // (Fruit) -> Boolean 이것을 줄여봅시다
}

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits2(fruits: List<Fruit>, filter: FruitFilter) { // 줄여짐..
}

/**
 * 응용
 */

data class KingGodGeneralMajestyKotlinExpert(
    val name: String = "minkang"
)

typealias theMap = Map<Long, KingGodGeneralMajestyKotlinExpert>

