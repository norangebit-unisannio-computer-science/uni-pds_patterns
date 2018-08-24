package test

import main.mvc.controller.command.*
import main.mvc.model.CounterModel
import org.junit.Assert
import org.junit.Test

class TestCommandManager {
    val cmdManager = CommandManager()
    val model = CounterModel()
    val addOne = AddOne(model)
    val addTwo = AddTwo(model)
    val odd = Odd(model)


    @Test
    fun TestExecute(){
        cmdManager.execute(odd)
        Assert.assertEquals(1, model.getCount())
        Assert.assertTrue(cmdManager.isEmpty())
        cmdManager.execute(addTwo)
        Assert.assertEquals(3, model.getCount())
        Assert.assertFalse(cmdManager.isEmpty())
        cmdManager.execute(odd)
        Assert.assertEquals(3, model.getCount())
        Assert.assertTrue(cmdManager.isEmpty())
        cmdManager.execute(addOne)
        Assert.assertEquals(4, model.getCount())
        Assert.assertFalse(cmdManager.isEmpty())
    }

    @Test
    fun testUndo(){
        cmdManager.execute(addOne)
        cmdManager.execute(addTwo)
        cmdManager.undo()
        Assert.assertEquals(1, model.getCount())
        cmdManager.execute(odd)
        cmdManager.execute(odd)
        cmdManager.undo()
        cmdManager.undo()
        cmdManager.undo()
        Assert.assertEquals(1, model.getCount())
    }

}