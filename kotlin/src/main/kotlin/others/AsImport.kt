package others

/**
 * 프로토타입이 같은 메소드를 불러와야하는 곤란한 상황에서 사용한다
 * 약간 파이썬.st
 */

import others.misc.A.Companion.doSomething as doSomethingByA
import others.misc.B.Companion.doSomething as doSomethingByB


fun main() {
    doSomethingByA()
    doSomethingByB()
}