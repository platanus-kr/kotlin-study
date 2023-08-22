package variable

fun main() {
    println("헐 여기서만 실행되네?")
}

class VariableClass {

    private val immNum = 1L
    private var mtNum

    fun main() {
        println("여긴 왜 안됨?")
    }
}