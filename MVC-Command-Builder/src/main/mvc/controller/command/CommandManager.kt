package main.mvc.controller.command

import java.util.*

class CommandManager {
    private val stack = Stack<UndoableCommand>()

    fun execute(c: Command){
        c.execute()
        if(c is UndoableCommand)
            stack.push(c)
    }

    fun undo(){
        if (!stack.empty()){
            val cmd = stack.pop()
            if(cmd is Odd && !stack.empty() &&stack.peek() is Odd)
                undo()
            else
                cmd.undo()
        }
    }

    fun isEmpty() = stack.isEmpty()
}