package main.mvc.controller.command

interface UndoableCommand: Command {
    fun undo()
}