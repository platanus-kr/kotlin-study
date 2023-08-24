package classes.inheritances

abstract class Animal (
    protected val species: String,
    protected open val legCount: Int, /** {@link KotlinPenguin} 참고. */
){

    abstract fun move()
}
