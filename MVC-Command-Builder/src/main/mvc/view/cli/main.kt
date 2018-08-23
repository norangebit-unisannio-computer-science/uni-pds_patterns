package main.mvc.view.cli

import main.mvc.controller.ControllerImp
import main.mvc.model.CounterModel

fun main(args: Array<String>){
    val model = CounterModel()
    val view = Cli()
    val controller = ControllerImp(model, view)

    view.launch()
}