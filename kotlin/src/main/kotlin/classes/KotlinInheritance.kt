package classes


fun main() {
    Derived(300) // -> 0 이 출력됨
}

/**
 * 예약어 정리
 *
 * final : override 할 수 없다
 * open : override를 열어분다
 * abstract : 반드시 override 해야한다
 * override : 키워드
 */
open class Base(
    open val number: Int = 100 // <<- open (죄악)
) {
    init {
        println("Base class")
        println(number) // Accessing non-final property number in constructor
        // -> 상위클래스의 생성자가 실행되는 동안 하위클래스의 프로퍼티가 초기화가 이뤄지지 않았기 때문에
        // Int의 초기값 0이 나온다.

        // 이와같이. 상위클래스를 설계할 때는 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다.
    }

}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived class")
    }

}
