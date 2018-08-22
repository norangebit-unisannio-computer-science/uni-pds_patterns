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