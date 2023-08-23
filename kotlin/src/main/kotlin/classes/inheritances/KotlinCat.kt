package classes.inheritances

class KotlinCat(
    species: String
) : KotlinAnimal(species, 4) { // 부모의 생성자를 바로 호출해야 한다.
    override fun move() { // @Override 명시 대신 override 예약어
        println("move the cat")
    }
}
