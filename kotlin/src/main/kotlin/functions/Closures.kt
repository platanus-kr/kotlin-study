

fun main() {

    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )


    var targetFruitName = "바나나"
    targetFruitName = "사과"

    filterFruits(fruits) {it.name == targetFruitName} // <- non-final이지만 된다. 자바는 안됨.

    /**
     * 코틀린은 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다.
     * 이렇게 해야만, 람다를 진정한 일급 시민으로 간주할 수 있다.
     *
     * 이 데이터 구조를 Closure라고 부른다.
     *
     * 이하 강의 질의응답에 있는 내용 복붙.
     *
     * 결론부터 말씀드리면, 코틀린의 경우 컴파일 과정에서 가변 변수를
     * Object로 감싸 (포획하여), 그 Object를 람다에서 접근하게 하고 있습니다.
     *
     * https://medium.com/@yangweigbh/how-kotlin-lambda-capture-variable-ef90e11e531d
     *
     * 에서 Kotlin이 변수를 capture 하는 방식을 확인해보실 수 있는데요! 한 줄 요약 드리면,
     * 어떤 변수를 Object로 만든 다음, 그 Object의 reference를 각 람다가 공유하는 방식입니다.
     * 다만 이 원리 자체가 thread-safe 하지는 않다 보니 사용에 주의가 필요할 수 있습니다.
     *
     */

    // 그러면 잊혀진 exceptions의 KotlinFilePrinter.kt 를 보면 아~~~ 하게 됨.
}


private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter.invoke(fruit)) {
            results.add(fruit)
        }
    }
    return results

}

class Fruit(
    val name: String,
    val price: Int,
)