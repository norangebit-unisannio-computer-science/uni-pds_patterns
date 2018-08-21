package adapter

import java.util.*


class CounterAdapter: Counter, Observable(){

    private val counter = OldCounter()

    override fun addOne() {
        counter.addOne()
        setChanged()
        notifyObservers()
    }

    override fun addTwo() {
        counter.addOne()
        counter.addOne()
        setChanged()
        notifyObservers()
    }

    override fun odd() {
        if(counter.count%2==0)
            addOne()
    }

    override fun getCount() = counter.count
}