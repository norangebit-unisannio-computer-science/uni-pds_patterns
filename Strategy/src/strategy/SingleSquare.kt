package strategy

class SingleSquare(movementBehaviour: MovementBehaviour?): BaseMovement(movementBehaviour) {

    override fun move() = "Moves one square in any direction.\n${super.move()}"

}