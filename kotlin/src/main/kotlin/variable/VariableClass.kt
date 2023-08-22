package variable

fun main() {
    println("-----------")

    /**
     * var/val/nullable
     */

    val number1: Long
    number1 = 10L

    val number2 = 10L

    var number3 = 10L

    var number4: Long
    number4 = 10L

    var number5: Long?
    number5 = null

    val number6: Long?
    number6 = null

    var person = Person("platanus", 12)

    println("-----------")

    val person2 = Person("platanus", 12) // platform type - kotlin이 @Nullable, @NotNull을 참조할 수 없을 때
    // 이 경우 NPE가 발생할 가능성이 있음.
    // 이런 문제가 발생할 수 있기 때문에 라이브러리 가져다 사용할때는 NPE 가능성 확인해야함.


}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null;
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A") // 위에서 null 체크를 했기 때문에 null이 아니겠거늘 한다.
}

fun startsWithA4(str: String?): Boolean? {  // null 체크의 safe call
    return str?.startsWith("A")
}

fun startsWithA5(str: String?): Boolean { // null 체크의 elvis 연산자
    return str?.startsWith("A") ?: throw IllegalArgumentException("문자열이 없습니다")
}

fun startsWithA6(str: String?): Boolean { // 이런식으로 활용가능
    return str?.startsWith("A") ?: false
}

fun startsWithA7(str: String?): Boolean { // assert
    return str!!.startsWith("A")
}



