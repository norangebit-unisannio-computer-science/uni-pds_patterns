package main.mvc.model

import main.mvc.model.Counter

class CounterModel: Counter() {

    private var count = 0

    override fun addOne() {
        count++
        setChanged()
        notifyObservers()
    }

    override fun addTwo(){
        count += 2
        setChanged()
        notifyObservers()
    }

    override fun odd(){
        if(count%2==0){
            addOne()
        }
    }

    override fun removeOne() {
        count--
        setChanged()
        notifyObservers()
    }

    override fun removeTwo() {
        count-=2
        setChanged()
        notifyObservers()
    }

    override fun even() {
        if(count%2==1)
            removeOne()
    }

    override fun getCount() = count

}