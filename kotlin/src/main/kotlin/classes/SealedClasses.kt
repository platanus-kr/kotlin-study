package classes

/**
 * 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
 * 즉, 런타임 때 클래스 타입이 추가죌 수 없다.
 *
 * 하위 클래스는 같은 패키지에 있어야 한다.
 *
 * Enum과 차이점
 *  - 클래스 상속 가능
 *  - 하위 클래스는 멀티 인스턴스가 가능.
 */

fun main() {
    val m3 = M3()
    println(m3.name)

    println("-----------------")

    handleCar(m3)
}

sealed class BMWCar(
    val name: String,
    val price: Long,
)

class M3 : BMWCar("M3", 14_000L)

class M340i : BMWCar("M340i", 7_000L)

class M2 : BMWCar("M2", 8_000)

/**
 * 추상화가 필요한 Entity, DTO에 sealed 활용
 */

private fun handleCar(model: BMWCar) {
    when(model) {
        is M2 -> println("이것은 M2 입니다.")
        is M3 -> println("이것은 M3 입니다.")
        is M340i -> println("이것은 M430i 입니다.")
    }
}
