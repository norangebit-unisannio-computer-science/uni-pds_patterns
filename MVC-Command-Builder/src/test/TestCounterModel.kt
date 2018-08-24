package test

import main.mvc.model.CounterModel
import org.junit.Assert
import org.junit.Test

class TestCounterModel {
    val model = CounterModel()

    @Test
    fun testAddOne(){
        model.addOne()
        Assert.assertEquals(1, model.getCount())
    }

    @Test
    fun testAddTwo(){
        model.addTwo()
        Assert.assertEquals(2, model.getCount())
    }

    @Test
    fun testOdd(){
        model.odd()
        Assert.assertEquals(1, model.getCount())
        model.odd()
        Assert.assertEquals(1, model.getCount())
    }

    @Test
    fun testRemoveOne(){
        model.removeOne()
        Assert.assertEquals(-1, model.getCount())
    }

    @Test
    fun testRemoveTwo(){
        model.removeTwo()
        Assert.assertEquals(-2, model.getCount())
    }

    @Test
    fun testEven(){
        model.addOne()
        model.addTwo()
        model.even()
        Assert.assertEquals(2, model.getCount())
        model.even()
        Assert.assertEquals(2, model.getCount())
    }
}