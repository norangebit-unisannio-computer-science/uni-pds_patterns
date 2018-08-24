package test

import main.mvc.controller.Controller
import main.mvc.view.View
import org.junit.Assert
import java.util.*

class StubView: View {

    private var undoEnable: Boolean = false
    private var controller: Controller? = null

    override fun getObserver(): Observer {
        return Observer({o,_ -> Assert.assertNotNull(o)})
    }

    override fun setUndoEnable(b: Boolean) {
        undoEnable = b
    }

    override fun setController(c: Controller) {
        controller = c
    }

    override fun launch() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getUndoEnable() = undoEnable
}