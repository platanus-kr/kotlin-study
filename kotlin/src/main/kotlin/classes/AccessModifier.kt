package classes

/**
 * Java와 Kotlin의 가시성 제어 차이
 * public : 동일
 *
 * protected : 같은패키지+하위패키지 -> 선언된 클래스+ 하위클래스
 * ?1 -> 코틀린에서는 패키지를 namespace 개념으로만 사용하기 때문에 자바의 패키지 개념과 차이가 있다.
 * ?2 -> 그래서 파일에서는 사용할 수 없다
 *
 * default : 패키지 개념이 없기 때문에 없음 (자바에만 있음)
 *
 * internal : 같은 모듈에서만 접근 가능 (코틀린에만 있음)
 * -> 바이트코드로 바뀌면 public이 되기 때문에 Java에서 Kotlin모듈의 internal에] 접근할 수 있다.
 *
 * private : 동일
 */

/**
 * 유틸성 메소드..
 * -> 인스턴스화를 막기 위해 어쩌구 저쩌구 할 필요 없이 그냥 파일에다 메서드를 만들면 된다.
 */


class Cat private constructor() { // <- 생성자에 접근제어자를 쓰고 싶으면 constructor를 생략할 수 없다.

}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set // <- 이렇게 하면 price는 getter만 public이다.
}
