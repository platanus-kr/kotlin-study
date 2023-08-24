package controlstatements.exceptions

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) { // 타입이 뒤로 감..
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    return try { // try-catch도 if와 마찬가지로 expression이다.
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}