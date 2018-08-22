package command

import Counter

class AddTwo(private val model: Counter): UndoableCommand {

    override fun execute() = model.addTwo()

    override fun undo() = model.removeTwo()

}