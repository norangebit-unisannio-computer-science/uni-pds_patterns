import builder.MyFrame
import command.AddOne
import command.AddTwo
import command.CommandManager
import command.Odd

class Controller(private val model: Counter, private val view: MyFrame) {

    private val cmdManager = CommandManager()

    fun addOne() {
        cmdManager.execute(AddOne(model))
        view.setUndoEnable(true)
    }

    fun addTwo() {
        cmdManager.execute(AddTwo(model))
        view.setUndoEnable(true)
    }

    fun odd() {
        cmdManager.execute(Odd(model))
        view.setUndoEnable(true)
    }

    fun undo() {
        cmdManager.undo()
        view.setUndoEnable(!cmdManager.isEmpty())
    }
}