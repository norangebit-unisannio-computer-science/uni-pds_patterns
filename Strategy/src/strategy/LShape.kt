package strategy

class LShape(movementBehaviour: MovementBehaviour?): BaseMovement(movementBehaviour) {

    override fun move() = "Can moves to any of the closest squares that are not on the same rank, file, or diagonal, thus the move forms an \"L\"-shape.\n${super.move()}"

}