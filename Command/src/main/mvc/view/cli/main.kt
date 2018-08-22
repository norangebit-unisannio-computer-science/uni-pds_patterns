package main.mvc.view.cli

import main.mvc.controller.Controller
import main.mvc.model.CounterModel

fun main(args: Array<String>){
    val model = CounterModel()
    val view = Cli()
    val controller = Controller(model, view)

    view.launch()
}