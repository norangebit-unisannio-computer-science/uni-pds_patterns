package test

import main.mvc.controller.ControllerImp
import main.mvc.model.CounterModel
import org.junit.Assert
import org.junit.Test

class TestController {
    val model = CounterModel()
    val view = StubView()
    val controller = ControllerImp(model, view)

    @Test
    fun testAddOne() {
        controller.addOne()
        Assert.assertEquals(1, model.getCount())
        Assert.assertTrue(view.getUndoEnable())
    }

    @Test
    fun testAddTwo() {
        controller.addTwo()
        Assert.assertEquals(2, model.getCount())
        Assert.assertTrue(view.getUndoEnable())
    }

    @Test
    fun testOdd(){
        controller.odd()
        Assert.assertEquals(1, model.getCount())
        Assert.assertFalse(view.getUndoEnable())
    }

    @Test
    fun testUndo(){
        controller.addOne()
        controller.undo()
        Assert.assertEquals(0, model.getCount())
        Assert.assertFalse(view.getUndoEnable())
    }
}