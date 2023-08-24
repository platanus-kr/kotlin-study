package functions

/**
 * Inline 함수
 *
 * 함수가 호출되는 대신, 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우.
 *
 * 단, 성능측정과 함께 신중하게 고려되야한다.
 */

fun main() {
    3.add3(4) // <- 바이트코드 돌려보면 함수 구현이  그대로 들어간다.
}

inline fun Int.add3(other: Int): Int {
    return this + other
}