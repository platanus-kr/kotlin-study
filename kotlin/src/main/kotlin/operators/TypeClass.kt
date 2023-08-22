package operators

fun main() {

    // 타입 추론
    val number1 = 3
    val number2 = 3L

    // 타입간 변환
    val number3 = 3;
//    val number4: Long = number3 // Type mismatch
    val number4: Long = number3.toLong() //이렇게 사용해야함.

    // null 처리
    val number5: Int? = 3
    val number6: Long = number5?.toLong() ?: 0L

    // String format
    val str1 = "플라타너스"
    println("${str1} 입니다.")

    val text1 = """
        Java
        Kotlin
        JVM
        ${str1}
    """.trimIndent()
    println(text1)

    // String indexing
    println(str1[0])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}


fun printAgeIfPerson2(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}

fun printAgeIfPerson3(obj: Any?) {
    val person = obj as? Person // obj 가 null이면 이 전체가 null이 됨.
    println(person?.age)
}

class TypeClass {


}