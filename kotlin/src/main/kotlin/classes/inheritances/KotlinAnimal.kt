package classes.inheritances

abstract class KotlinAnimal (
    protected val species: String,
    protected open val legCount: Int, /** {@link KotlinPenguin} 참고. */
){

    abstract fun move()
}
