package command

import Counter

class Odd(private val model: Counter): UndoableCommand {

    override fun execute() = model.odd()

    override fun undo() = model.even()

}