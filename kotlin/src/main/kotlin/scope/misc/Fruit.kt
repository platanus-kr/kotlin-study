package scope.misc


class Fruit(val name: String, val price: Long)

internal interface FruitFilter {
    fun isSelected(fruit: Fruit?): Boolean
}