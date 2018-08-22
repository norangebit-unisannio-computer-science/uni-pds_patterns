package main.mvc.view.swing

import main.mvc.controller.Controller
import main.mvc.model.CounterModel

fun main(args: Array<String>){
    val model = CounterModel()
    val view = MyFrame()
    val controller = Controller(model, view)

    view.build(args.size)
    view.isVisible = true
}

