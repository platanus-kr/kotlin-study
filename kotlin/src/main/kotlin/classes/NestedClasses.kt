package classes

/**
 * 잠깐 정리하고 가는 중첩 클래스
 *
 * 클래스 내부의 static 클래스 : 외부로 참조가 안됨
 *
 * 클래스 내부의 클래스
 * - inner class : 밖에 참조 가능
 * - local class : (메소드 내부 클래스 정의)
 * - anonymous class : 익명 클래스 (인터페이스 구현)
 *
 * ->> 이펙자바에 따르면
 *  1. 내부 클래스는 외부 클래스의 정보를 잠재적으로 갖고 있기 때문에 메모리 누수 가능성이 있다.
 *  2. 직렬화/역직렬화가 매우 좀 그렇다.
 *  3. 그래서 클래스 내 클래스를 만들때는 static으로 해라. <<<<<--- 중요
 *
 */

class HouseInnerStatic(
    var address: String,
    var livingRoom : LivingRoom = LivingRoom(10.0)
) {
    class LivingRoom( // <<- 코틀린은 이펙자바에 매우 충실해서 내부 클래스를 만들면 static이 기본이다.
        private var area: Double,
    )
}

class HouseInnerNonStatic( // static이 아닌 내부 클래스를 만드는 경우.
    var address:String,
) {
    var livingRoom: LivingRoom = LivingRoom(12.0)

    inner class LivingRoom( //<< - inner 키워드를 붙인다.
        private var area : Double,
    ) {
        val address :String
        get() = this@HouseInnerNonStatic.address // <<- 바깥 참조를 위해 사용되는 @ 지정
    }
}
