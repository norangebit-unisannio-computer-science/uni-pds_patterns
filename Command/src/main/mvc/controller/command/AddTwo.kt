package main.mvc.controller.command

import main.mvc.model.Counter

class AddTwo(private val model: Counter): UndoableCommand {

    override fun execute() = model.addTwo()

    override fun undo() = model.removeTwo()

}