package adapter

class OldCounter {

    var count = 0
        private set

    fun addOne() = count++

    fun removeOne() = count--
}