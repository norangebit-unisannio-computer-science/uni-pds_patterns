package main.mvc.controller.command

import java.util.*

class CommandManager {
    private val stack = Stack<UndoableCommand>()

    fun execute(c: Command){
        c.execute()
        if(c is UndoableCommand)
            stack.push(c)
        else
            stack.clear()
    }

    fun undo(){
        if (!stack.empty())
            stack.pop().undo()
    }

    fun isEmpty() = stack.isEmpty()
}