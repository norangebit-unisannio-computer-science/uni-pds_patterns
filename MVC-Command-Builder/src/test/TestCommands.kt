package test

import main.mvc.controller.command.*
import main.mvc.model.CounterModel
import org.junit.Assert
import org.junit.Test

class TestCommands {
    val model = CounterModel()

    @Test
    fun testAddOne(){
        AddOne(model).execute()
        Assert.assertEquals(1, model.getCount())
    }

    @Test
    fun testAddTwo(){
        AddTwo(model).execute()
        Assert.assertEquals(2, model.getCount())
    }

    @Test
    fun testOdd(){
        Odd(model).execute()
        Assert.assertEquals(1, model.getCount())
        Odd(model).execute()
        Assert.assertEquals(1, model.getCount())
    }

    @Test
    fun testAddOneUndo(){
        AddOne(model).undo()
        Assert.assertEquals(-1, model.getCount())
    }

    @Test
    fun testAddTwoUndo(){
        AddTwo(model).undo()
        Assert.assertEquals(-2, model.getCount())
    }

    /**
    @Test
    fun testOddUndo(){
        model.addOne()
        Odd(model).undo()
        Assert.assertEquals(0, model.getCount())
        Odd(model).undo()
        Assert.assertEquals(0, model.getCount())
    }**/
}