package classes


fun main() {
    println(Singletons.name)
}

object Singletons {
    val name: String = "싱글톤"
}
