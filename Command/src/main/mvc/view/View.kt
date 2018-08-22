package main.mvc.view

import main.mvc.controller.ControllerI
import java.util.*

interface View {
    fun getObserver(): Observer
    fun setUndoEnable(b: Boolean)
    fun setController(c: ControllerI)
}