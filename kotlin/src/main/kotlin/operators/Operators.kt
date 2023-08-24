package operators

import operators.operatoroverriding.JavaMoney
import operators.operatoroverriding.KotlinMoney

fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)

    if (money1 > money2) { // 저 비교연산자 따라가보면 comparable implement로 따라감.
        println("Money1이 Money2 보다 금액이 큽니다")
    }

    println("--------------------")
    // 동등성 Equality : 두 객체의 값이 같은가?
    // 동일성 Identity : 완전히 동일한가? 즉, 주소가 같은가?

    val money3 = JavaMoney(1000L)
    val money4 = money3
    val money5 = JavaMoney(1000L)

    println(money3 === money4) // 주소비교
    println(money3 == money5) // equals(), 연산자 따라가보면 equals로 나옴.

    // in

    // a..b

    // a[i]

    // a[i] = b

    println("--------------------")
    // operator overloading
    val kMoney1 = KotlinMoney(1000L)
    val kMoney2 = KotlinMoney(2000L)
    println(kMoney2 - kMoney1) // 이것도 연산자 따라가기 가능...
}

