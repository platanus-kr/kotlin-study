package functions


/**
 * 자바의 Funtional Programming의 역사.. {@link JavaLambdas} 참고..
 *
 * 코틀린에서는 함수가 그 자체로 값이 될 수 있다.
 * 변수에 할당하는것, 파라미터에 할당하는것 모두 가능.
 *
 */

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

    // 변수의 파라미터-반환타입은 생략가능...
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean { // <-  코틀린에서 이름없는 함수, 즉, 람다!
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruits: Fruit -> fruits.name == "사과" }

    // 호출하는 방법 두가지
    isApple(fruits[0])
    isApple.invoke(fruits[0])


    // JavaLambda를 옮겨봅시다..
    filterFruits(fruits, isApple) // <- 자바와 다르게 함수를 바로 던질 수 있다.

    filterFruits(fruits, fun(fruit: Fruit): Boolean { // <- 이렇게도 되고 (isApple)
        return fruit.name == "사과" })

    filterFruits(fruits,  { fruit: Fruit -> fruit.name == "사과" }) // <- 이렇게되 된다 (isApple2)

    filterFruits(fruits)  { fruit: Fruit -> fruit.name == "사과" } // <- 이것도 된다. 무려 IDE 권장.. 함수 파라미터가 마지막에 위치한 경우 가능

    filterFruits(fruits)  { fruit -> fruit.name == "사과" }

    filterFruits(fruits)  { it.name == "사과" } // <- it, 파라미터가 한개인 경우에만. 그러나 사용을 지양하자. 왜냐면 뭐가 들어가는지 코드만 봐서는 감이 잘 안오기 때문.

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