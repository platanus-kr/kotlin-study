package classes.inheritances

class KotlinPenguin(
    species: String /**, override val swimAbility: Int // 여기 넣든가.. */
) : KotlinAnimal(species, 2), Flyable, Swimable {

    private val wingCount: Int = 2
    override fun move() {
        println("move the penguin")
    }

    override val swimAbility: Int
        get() = 3
    override val legCount: Int // 프로퍼티에 override하려면 부모의 프로퍼티에 open 예약어를 붙여야 한다.
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act() // Swimable.super.act() ....
        super<Flyable>.act()
    }

}
