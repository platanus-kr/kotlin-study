package controlstatements

import java.lang.IllegalArgumentException

// 일반 if : java와 동일.
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다")
    }
}


// 범위
fun validateScoreIsNotNegative2(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 0부터 100 입니다")
    }
}


// Java에서 if 문법은 statement지만
// Kotlin에서는 expression이다.
// 그래서 kotlin에는 삼항연산자가 없다.

// statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
// expression : 하나의 값으로 도출되는 문장
fun getPassOrFailStatement(score: Int): String {
    if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
}

fun getPassOrFailExpression(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

// switch

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score / 10) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("-1,0,1 이 아닙니다")
    }
}

fun judgeNumber2(number: Int ) {
    when {
        number == 0 -> println("주어진 숫자는 0 입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수 입니다.")
        else -> println("주어지는 숫자는 홀수 입니다.")
    }
}

// when의 경우 enum, sealed와 함께 사용하면 더 좋다.

