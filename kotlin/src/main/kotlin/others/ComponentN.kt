package others

import java.time.LocalDateTime


/**
 * 구조분해
 */

data class Camera(
    val model: String,
    val vendor: String,
    val price: Long,
    val launchDate: LocalDateTime,
)

fun main() {
    val z8 = Camera("Z8", "Nikon", 100L, LocalDateTime.now())

    val (model1, vendor1, price1, launchDate1) = z8 // <<- 이거당

    // data class 일 때만 구조분해가 된다.
    // data의 특징.

    // 이것도 같은 구조분해임.
    val model2 = z8.component1()
    val vendor2 = z8.component2()
    val price2 = z8.component3()
    val launchDate2 = z8.component4()

    println(model1 === model2)
    println(vendor1 === vendor2)
    println(price1 == price2)
    println(launchDate1 === launchDate2)

    //아닌걸 하고 싶다면? 아래와 같이..
}

class Lens(
    val rangeStart: Long,
    val rangeEnd: Long?,
    val isPrime: Boolean,
    val price: Long,
) {
    operator fun component1(): Long { // 여기에 구현을 갖다넣으면 될듯 한데.. 이렇게 할 바에 그냥 유틸 메서드를 만들지..
        return this.rangeStart
    }
    //...
}