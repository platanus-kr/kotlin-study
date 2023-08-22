package controlstatements

fun main() {

}

// function define
fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

// public은 생략 가능
public fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

// 리턴타입 생략 가능 (타입추론)
public fun max3(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }

// 중괄호 생략 가능
public fun max4(a: Int, b: Int) = if (a > b) a else b
