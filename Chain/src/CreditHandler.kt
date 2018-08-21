
open class CreditHandler(private val next: CreditHandler?) {

    open fun handle(amount: Int){
        if (next!=null)
            forward(amount)
        else
            println("no next")
    }

    protected fun forward(amount: Int){
        if (next!=null)
            next.handle(amount)
        else
            println("no next")
    }
}