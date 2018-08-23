package main.mvc.view

import main.mvc.controller.Controller
import java.util.*

interface View {
    fun getObserver(): Observer
    fun setUndoEnable(b: Boolean)
    fun setController(c: Controller)
    fun launch()
}