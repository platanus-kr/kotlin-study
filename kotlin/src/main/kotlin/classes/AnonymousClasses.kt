package classes

import classes.misc.JavaMovable

fun main() {
    moveSomething(object :JavaMovable {
        override fun move() {
            println("움직이는 중")
        }

        override fun fly() {
            println("나는 중")
        }
    })
}

private fun moveSomething(movable: JavaMovable) {
    movable.move()
    movable.fly()
}
