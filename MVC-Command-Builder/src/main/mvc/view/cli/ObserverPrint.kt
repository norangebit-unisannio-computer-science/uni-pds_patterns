package main.mvc.view.cli

import main.mvc.model.Counter
import java.util.*

class ObserverPrint: Observer {
    override fun update(p0: Observable?, p1: Any?) {
        println("count: ${(p0 as Counter).getCount()}")
    }

}