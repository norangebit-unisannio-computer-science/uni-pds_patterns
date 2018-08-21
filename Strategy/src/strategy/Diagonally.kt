package strategy

class Diagonally(movementBehaviour: MovementBehaviour?): BaseMovement(movementBehaviour) {

    override fun move() = "Can move any number of squares diagonally, but cannot leap over other pieces.\n${super.move()}"

}