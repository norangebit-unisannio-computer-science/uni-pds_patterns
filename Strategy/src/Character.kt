import strategy.MovementBehaviour

open class Character(private val movementBehaviour: MovementBehaviour){

    fun move() = movementBehaviour.move()
}