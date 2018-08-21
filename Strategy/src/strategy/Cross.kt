package strategy

class Cross(movementBehaviour: MovementBehaviour?): BaseMovement(movementBehaviour) {

    override fun move() = "Can move any number of squares along a rank or file, but cannot leap over other pieces.\n${super.move()}"

}