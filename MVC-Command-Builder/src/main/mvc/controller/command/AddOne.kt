package main.mvc.controller.command

import main.mvc.model.Counter

class AddOne(private val model: Counter): UndoableCommand {

    override fun execute() = model.addOne()

    override fun undo() = model.removeOne()

}