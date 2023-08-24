package classes

/**
 * 이렇게 만든 data클래스에는 아래와 같은게 자동으로 포함된다
 *
 * 1. 생성자
 * 2. getter
 * 3. equals, hashCode
 * 4. toString
 */

data class DataClasses(
    val name: String,
    val age: Int,
)

fun main() {
    val dataClasses = DataClasses("아이유", 30)
    val dataClassesOther = DataClasses("아이유", 30)
    println("toString() : " + dataClasses)
    println("Identity check : " + (dataClasses === dataClassesOther))
    println("equals and hashCode : " + (dataClasses == dataClassesOther))
}
