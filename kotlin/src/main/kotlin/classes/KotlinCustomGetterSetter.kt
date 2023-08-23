package classes

class KotlinCustomGetterSetter {
}

class KotlinClass7(val name: String = "홍길동", var age: Int = 20) {
    init {
        if (age < 1) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    fun isAdult(): Boolean {
        return this.age >= 19
    }

    val isAdult2: Boolean
        get() {
            return this.age >= 19
        }

    val isAdult3: Boolean get() = this.age >= 19 // <<- 최종형태


}

class KotlinClass8(name: String = "홍길동", var age: Int = 20) {

    /**
     * getter
     */

    // backing field
    val name: String = name // 주 생성자의 name을 프로퍼티에 바로 대입
        get() = field.uppercase()
    // custom getter에는 field(예약어)가 필요한데
    // 그 이유는 name을 써버리면 그 자체가 getter 호출이 되니 무한츠쿠요미가 됨

    // 그런데 정작 backing field는 또 잘 안씀 그냥 유틸성 메소드를 하나 만듬
    val uppperCaseName: String
        get() = this.name.uppercase()
}


class KotlinClass9(name: String = "홍길동", var age: Int = 20) {
    /**
     * setter
     */

    var name : String =name
        set(value) {
            field = value.uppercase()

        }
}