import adapter.Counter
import java.util.*

class CounterModel : Observable(), Counter {

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

    override fun getCount() = count

}