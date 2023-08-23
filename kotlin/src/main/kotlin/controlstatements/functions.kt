package controlstatements

fun main() {
    // default argument use
    val defaultArg = defaultArg()
    println("${defaultArg.name}, ${defaultArg.age}")

    println("-------------------------")

    // named argument
    val namedArg = namedArg(age = 30) // 이 경우 builder 패턴을 사용하지 않고도 builder의 장점을 가지게됨.
    println("${namedArg.name}, ${namedArg.age}")

    println("-------------------------")

    // 가변인자 use
    varArgs("아이유", "이지금", "이지동")
    val arrays = arrayOf("아이유", "이지금", "이지동")
    varArgs(*arrays)
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
fun max3(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }

// 중괄호 생략 가능
fun max4(a: Int, b: Int) = if (a > b) a else b


// default argument
fun defaultArg(name: String = "홍길동", age: Int = 20) = FuncPerson(name, age)

// named argument
fun namedArg(name: String = "아이유", age: Int) = FuncPerson(name, age)

// 가변인자
fun varArgs(vararg strs: String) {
    for (str in strs) {
        println(str)
    }
}

