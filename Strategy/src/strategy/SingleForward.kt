package strategy

class SingleForward(movementBehaviour: MovementBehaviour?): BaseMovement(movementBehaviour) {

    override fun move() = "Can move forward to the unoccupied square immediately in front of it on the same file, or on its first move it can advance two squares along the same file.\n${super.move()}"

}