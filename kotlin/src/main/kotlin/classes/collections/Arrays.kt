package classes.collections

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) { // <- 이렇게 해야 인덱스가 나옴
        println(array[i])
    }
    println("-----------------------------")

    for ((index, value) in array.withIndex()) {
        println("${index}, ${value}")
    }

    println("-----------------------------")

    array.plus(300) // <-- 배열의 추가

}
