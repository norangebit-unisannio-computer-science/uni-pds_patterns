package main.mvc.model

import java.util.*

abstract class Counter: Observable() {

    abstract fun getCount(): Int

    abstract fun addOne()

    abstract fun addTwo()

    abstract fun odd()

    abstract fun removeOne()

    abstract fun removeTwo()

    abstract fun even()
}