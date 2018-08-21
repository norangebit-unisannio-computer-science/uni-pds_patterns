package strategy

open class BaseMovement(private val movementBehaviour: MovementBehaviour?): MovementBehaviour {

    override fun move() = movementBehaviour?.move() ?: ""
}
