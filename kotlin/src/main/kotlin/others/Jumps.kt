package others

/**
 * Jump
 *
 * 코틀린에는 break, continue가 없다.
 * 블록을 탈출하는 키워드를 다시 보자.
 *
 * return : 기본적으로 가장 가까운 enclosing function 또는 익명함수로 값이 반환된다.
 * break : 가장 가까운 루프가 제거된다.
 * continue : 가장 가까운 루프를 다음 step으로 보낸다.
 *
 */

class Jumps {

}
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)

    // 코틀린의 continue 용법

    // 첫번째
    run {
        numbers.forEach { number ->
            if (number == 3) {
                return@run // <<- 바깥의 run으로 나가진다. 어떤 커스텀이 아니라 코틀린 내장 inline 함수임. 그래서 이름은 안바뀜.
            }
        }
    }

    // 두번째
    numbers.forEach { number ->
        if (number == 3) {
            return@forEach // <<- 이런식으로 탈출됨
        }
    }

    // 그렇지만,
    // break나 continue가 필요하면
    // 그냥 for 루프를 쓰자.
}