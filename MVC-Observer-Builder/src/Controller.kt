class Controller(private val model: CounterModel, private val view: ObserverLabel) {

    fun addOne() = model.addOne()

    fun addTwo() = model.addTwo()

    fun odd() = model.odd()
}