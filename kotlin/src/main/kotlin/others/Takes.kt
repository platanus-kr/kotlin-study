package others

/**
 * TakeIf, TakeUnless
 *
 * 메소드 체이닝을 위한 코틀린만의 특이한 함수 (잘안씀)
 */

fun main() {


}

// 1. 기본형 (원래 함수)
fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

// 2. take 용법
fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { it > 0 } // 주어진 조건을 만족하면 값이, 아니면 null이 반환된다.
}

fun getNumberOrNullV3(number: Int): Int? {
    return number.takeUnless { it >= 0 } // 주어진 조건을 만족하면 null, 아니면 값이 반환된다.
}
