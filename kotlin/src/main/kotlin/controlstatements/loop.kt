package controlstatements

fun main() {
    val numbers = listOf(1L, 2L, 3L)

    println("--------------------------")

    for (number in numbers) {
        println(number)
    }

    println("--------------------------")

    for(i in 1..3) {
        println(i)
    }

    println("--------------------------")

    for (i in 3 downTo 1) {
        println(i)
    }

    println("--------------------------")

    for (i in 1..5 step 2) {
        println(i)
    }

    /**
     * for의 `..` : IntRange -> IntProgressions (등차수열) : 시작 값, 끝 값, 공차step
     * -> 사실은 등차수열을 만들어주고 있었던 것
     *
     * step : 중위함수 '변수.함수이름' 대신 '변수 함수이름 argument'
     */

    println("--------------------------")

    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }

}
