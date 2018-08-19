import java.util.*

class CounterModel : Observable() {

    var count = 0
        private set

    fun addOne() {
        count++
        setChanged()
        notifyObservers()
    }

    fun addTwo(){
        count += 2
        setChanged()
        notifyObservers()
    }

    fun odd(){
        if(count%2==0){
            addOne()
        }
    }


}