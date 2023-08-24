package collections

fun main() {

    val numbers = listOf(100, 200) // <-- 불변
    val mutableNumbers = mutableListOf(100, 200) // <-- 가변

    var emptyList = emptyList<Int>() // <-- 제네릭 타입 지정해줘야됨.

    printNumbers(emptyList()) // <-- 자바와 마찬가지로 추론이 가능하면 제네릭 생략 가능


    // 아래 둘은 같다
    numbers.get(0)
    numbers[0]

    // iterator도 같다

    /// 컬렉션의 null 가능성

    val elementNull = mutableListOf<Int?>(100,200)

}

private fun printNumbers(numbers: List<Int>) {

}