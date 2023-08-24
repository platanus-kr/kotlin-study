package classes


enum class Country(
    val code: String
) {
    KOREA("KO"),
    USA("US"),
    ;
}

// -> 이를 when으로 분기했을때 굉장해짐

private fun handleCountry(country: Country) {
    when(country) { //<< - when을 쓰면 컴파일러가 자동으로 enum클래스의 변화에 대해 알려줌.
        Country.KOREA -> TODO()
        Country.USA -> TODO()
    }
}
