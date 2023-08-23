package classes.inheritances

interface Swimable {

    val swimAbility: Int // backing field 없는 프로퍼티 생성 가능

//    val swimAbility: Int get() = 3 // 이렇게 미리 넣는것도 가능.
    fun act() {
        println(swimAbility) // 자식이 구현해 주 것이라는 -믿음-
        println("어푸어푸")
    }
}
