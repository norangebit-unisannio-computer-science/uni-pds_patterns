package main.mvc.controller

import main.mvc.controller.command.AddOne
import main.mvc.controller.command.AddTwo
import main.mvc.controller.command.CommandManager
import main.mvc.controller.command.Odd
import main.mvc.model.Counter
import main.mvc.view.View

class ControllerImp(private val model: Counter, private val view: View): Controller {
    private val cmdManager = CommandManager()

    init {
        view.setController(this)
        model.addObserver(view.getObserver())
    }

    override fun addOne() {
        cmdManager.execute(AddOne(model))
        view.setUndoEnable(true)
    }

    override fun addTwo() {
        cmdManager.execute(AddTwo(model))
        view.setUndoEnable(true)
    }

    override fun odd() {
        cmdManager.execute(Odd(model))
        view.setUndoEnable(false)
    }

    override fun undo() {
        cmdManager.undo()
        view.setUndoEnable(!cmdManager.isEmpty())
    }
}