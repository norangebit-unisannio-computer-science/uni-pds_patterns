package main.mvc.view.cli

import main.mvc.controller.Controller
import main.mvc.view.View
import java.util.*
import kotlin.system.exitProcess

class Cli: View {
    private val observer = ObserverPrint()
    private var undoEnable = false
    private var controller: Controller? = null

    private fun printMenu(){
        println("What do you want to do?")
        println("0 - exit")
        println("1 - +1")
        println("2 - +2")
        println("3 - odd")
        if(undoEnable)
            println("4 - undo")
    }

    private fun choice(i: Int){
        if(controller!=null)
            when(i){
                1 -> controller?.addOne()
                2 -> controller?.addTwo()
                3 -> controller?.odd()
                4 -> if (undoEnable) controller?.undo() else println("invalid choice")
            }
        else{
            println("Error")
            exitProcess(1)
        }
    }

    override fun launch(){
        val sc = Scanner(System.`in`)
        printMenu()
        var choice = sc.nextInt()
        while (choice!=0){
            choice(choice)
            printMenu()
            choice = sc.nextInt()
        }

    }

    override fun getObserver() = observer

    override fun setUndoEnable(b: Boolean) {
        undoEnable = b
    }

    override fun setController(c: Controller) {
        controller = c
    }
}