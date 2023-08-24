package functions

/**
 * 중위함수 (Infix)
 *
 * 전에 없던 함수를 호출하는 새로운 방법 (operator에서 한번 봤었음)
 *
 * 기존처럼 변수.함수이름(파라미터) 대신
 * 변수 함수이름 파라미터 로 쓰는것을 중위함수라고 함.
 *
 *
 *
 */


fun main() {
    3.add(4)

    3.add2(4)

    3 add2 4 // <<----
}
fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}