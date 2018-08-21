import adapter.Counter

class Controller(private val model: Counter, private val view: ObserverLabel) {

    fun addOne() = model.addOne()

    fun addTwo() = model.addTwo()

    fun odd() = model.odd()
}