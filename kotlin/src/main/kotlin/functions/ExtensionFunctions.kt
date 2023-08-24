package functions


/**
 * 확장함수
 * 원래 맴버인것 처럼 사용할 수 있다.
 *
 * 단, 대상 클래스에 있는 private 또는 protected 맴버를 가져올 수 없다.
 *
 * 시그니처가 같은 경우는 맴버 쪽을 우선 호출한다. 오류 주의!
 *
 * 오버라이딩의 경우 현재 타입을 기준으로 호출된다.
 *
 * 자바에서도 정적 메소드를 쓰듯 쓰면된다.
 *
 */

fun main() {

    println("the words".lastChar())

}

fun String.lastChar(): Char { // -> 확장대상 클래스를 수신객체 타입이라고 한다.
    return this[this.length - 1]
    // -> 이때의 this를 수신객체라고 한다
}

val String.lastChar2: Char // 확장 프로퍼티의 경우.
    get() = this[this.length - 1]