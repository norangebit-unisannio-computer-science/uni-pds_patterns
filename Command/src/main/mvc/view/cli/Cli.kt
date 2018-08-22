package main.mvc.view.cli

import main.mvc.controller.ControllerI
import main.mvc.view.View
import java.util.*
import kotlin.system.exitProcess

class Cli: View {
    private val observer = ObserverPrint()
    private var undoEnable = false
    private var controller: ControllerI? = null

    fun printMenu(){
        println("Cosa vuoi fare?")
        println("0 - exit")
        println("1 - +1")
        println("2 - +2")
        println("3 - odd")
        if(undoEnable)
            println("4 - undo")
    }

    fun choise(i: Int){
        if(controller!=null)
            when(i){
                1 -> controller?.addOne()
                2 -> controller?.addTwo()
                3 -> controller?.odd()
                4 -> if (undoEnable) controller?.undo() else println("scelta non valida")
            }
        else{
            println("Error")
            exitProcess(1)
        }
    }

    fun launch(){
        val sc = Scanner(System.`in`)
        printMenu()
        var choise = sc.nextInt()
        while (choise!=0){
            choise(choise)
            printMenu()
            choise = sc.nextInt()
        }

    }

    override fun getObserver() = observer

    override fun setUndoEnable(b: Boolean) {
        undoEnable = b
    }

    override fun setController(c: ControllerI) {
        controller = c
    }
}