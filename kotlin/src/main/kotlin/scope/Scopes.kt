package scope

import scope.misc.ScopePerson

/**
 * scope functions..
 * -> 일시적인 영역을 형성하는 함수
 *
 */

// 1. 기본코드 (미사용)
fun printPerson(person: ScopePerson?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

// 2. scope function 사용 (예시)
fun printPersonV2(person: ScopePerson?) {
    person?.let {
        // 1. safe call을 사용해서 null이 아닐때 let 호출
        // 2. let : scope function의 한 종류.
        println(person.name)
        println(person.age)
    }
}

/**
 * 람다를 사용해 일시적인 영역을 만들고
 * 코드를 더 간결하게 하거나, 메소드 체이닝에 활용하는 함수
 * -> scope function
 *
 * (중요) 이런 것들은 외우라고 있는게 아님.
 *
 * let, run -> 람다의 결과를 반환
 * also, apply -> 객체 그 자체를 반환
 * with
 */

fun printPersonV3(person: ScopePerson) {

    // (T) -> R        like...  Function<T, R>
    val v1 = person.let {
        it.age
    }

    // T.() -> R
    val v2 = person.run {
        this.age
    }

    // (T) -> Unit      like... Consumer<T>
    val v3 = person.also {
        it.age
    }

    // T.() -> Unit
    val v4 = person.apply {
        this.age
    }
}

// 용법의 예

fun printPersonV4(strs: List<String>) {

    // let 1
    strs.stream().map { it.length }
        .filter { it > 3 }
        .let { lengths -> println(lengths) } // <<--

    // let 2
    val str = strs.get(0)
    val strlet = str.let {
        println(it.uppercase())
        it.length
    }

    // run.....
    val person = ScopePerson("아이유", 30)
        .run(::personRepositorySave)

    // 근데 사실 이게 훨씬 자연스럽고 눈에 들어옴.
    val person2 = ScopePerson("아이유", 30)
    personRepositorySave(person2)

    // apply
    // Test 픽스처 만들때 쓴다는데.. 일단 봅시다
    applyForFixture("아이유", "콘서트")

    // also
    mutableListOf(1, 2, 3, 4)
        .also { println("중간감상 : $it") } // 중간에 뭔가 처리가 필요할때.
        .add(5)


    // with
    // 특정 객체를 다른 객체로 변환해야하는데, 모듈간 의존성때문에
    // 정적 팩토리나 toClass를 만들기 어려울때
    withForFixture("아이유", "콘서트", ScopePerson("아이유", 30))

}

// apply 용법
fun applyForFixture(
    name: String,
    hobby: String,
): ScopePerson {
    return ScopePerson(
        name = name,
        age = 20,
    ).apply {
        this.hobby = hobby
    }
}

// with 용법
fun withForFixture(
    name: String,
    hobby: String,
    person: ScopePerson
): ScopePerson {
    return with(person) { // << this 생략이 된다는데요.
        ScopePerson(
            name = name,
            age = 20,
        )
    }
}

/**
 * 결론
 *
 * 편리함을 주는것은 사실이나 코드 난독화됨..
 * 남발하는것 보다 진짜 꼭 필요한데만 써야됨
 *
 * 이유1. 디버깅
 * 이유2. 수정
 * 이유3. 코드 난이도
 */

private fun personRepositorySave(obj: ScopePerson): Unit {}

