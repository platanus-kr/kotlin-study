package collections

fun main() {

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        //...
    }

    for ((key, value) in oldMap.entries) {
        //...
    }

}