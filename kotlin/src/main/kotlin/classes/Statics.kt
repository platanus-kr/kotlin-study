package classes

import classes.misc.CustomLog

fun main() {
    println(KotlinStaticPerson.newBaby("아이유"))
    val newBaby = KotlinLog.Factory.newBaby("이지금")
    KotlinLog.log()
}

class KotlinStaticPerson private constructor(
    private val name: String,
    private val age: Int
) {

    companion object { // << - static 대신 companion object 블록 사용.
        private val MIN_AGE = 0 // private static final int, 런타임시 변수 할당
        private const val MIN_AGE_CONST = 10 // 컴파일시 변수 할당, 기본타입과 String 까지만 붙일 수 있음

        @JvmStatic // <<- 자바 코드와 함께 써야 한다면 정적 메소드라는것을 이렇게 알려줘야함. 코틀린만 쓸때는 필요없다.
        fun newBaby(name: String): KotlinStaticPerson { // public static KotlinStaticPerson newBaby()
            return KotlinStaticPerson(name, MIN_AGE)
        }
    }

    /**
     * (java) static: 클래스가 인스턴스화 될 때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리 값을 공유
     * companion object : 클래스와 동행하는 유일한 오브젝트
     */
}


class KotlinLog private constructor(
    private val name: String,
    private val age: Int
) {

    companion object Factory : CustomLog { // << - 이 자체가 객체기 때문에 인터페이스 구현이 가능하다는 부분만.
        private const val MIN_AGE = 10
        fun newBaby(name: String): KotlinLog {
            return KotlinLog(name, MIN_AGE)
        }

        override fun log() {
            println("로그..")
        }
    }

}
