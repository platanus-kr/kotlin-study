package operators

data class KotlinMoney(
    val amount: Long
) {

    operator fun plus(other: KotlinMoney): KotlinMoney {
        return KotlinMoney(this.amount + other.amount)
    }

    operator fun minus(other: KotlinMoney): KotlinMoney {
        return KotlinMoney(this.amount - other.amount)
    }

}