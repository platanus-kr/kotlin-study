package classes

class KotlinClass1 constructor(name: String, age: Int) {

    val name = name
    var age = age

    // 프로퍼티 = 필드 + getter + setter
    // kotlin은 필드만 만들면 getter, setter가 자동으로 생성된다.

}

class KotlinClass2(name: String, age: Int) {
    // constructor 는 생략가능

    val name = name
    var age = age

}

class KotlinClass3(var name: String, val age: Int) {
    // 필드 선언과 생성자를 동시에 합칠 수 있다.
}

class KotlinClass4(var name: String, val age: Int) {
    init { // init block으로 초기화 가능
        if (age < 1) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }
}

class KotlinClass5(val name: String, var age: Int) {
    init {
        if (age < 1) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("init 블록")
    }

    constructor(name: String) : this(name, age = 20) { // 코틀린 부 생성자
        println("부 생성자 1")
    }
    constructor () : this("홍길동") {
        println("부 생성자 2") // 이 부생성자의 실행 순서 확인 해보기
    }
}

class KotlinClass6(val name: String = "홍길동", var age: Int = 20) { // 사실은 부생성자 보다 default parameter를 권장.
    init {
        if (age < 1) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("init 블록")
    }
}



fun main() {
    val kotlinClass5 = KotlinClass5("아이유")
    println(kotlinClass5.name)
    println(kotlinClass5.age)

    println("---------------")

    val kotlinClass5_2 = KotlinClass5() // !!! 생성자는 역순으로 실행된다는점 꼭 확인.

    println("---------------")

    try{
        KotlinClass6(age = -1)
    } catch (e: IllegalArgumentException){
        println(e.message)
    }
}