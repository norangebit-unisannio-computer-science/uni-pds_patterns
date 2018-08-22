package command

interface UndoableCommand: Command {
    fun undo()
}