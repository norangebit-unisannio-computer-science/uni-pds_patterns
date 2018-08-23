package main.mvc.view.swing

import main.mvc.controller.ControllerImp
import main.mvc.model.CounterModel

fun main(args: Array<String>){
    val model = CounterModel()
    val view = MyFrame(args.size)
    val controller = ControllerImp(model, view)

    view.launch()
}

