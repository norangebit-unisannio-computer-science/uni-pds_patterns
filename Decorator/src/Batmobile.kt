class Batmobile(car: Car): CarDecorator(car) {

    init {
        println()
        println("Now you are a Batmobile!")
        println()
    }

    override fun go() {
        super.go()
        println("Come on guys, I'm Batman")
    }

    override fun run() {
        super.run()
        println("70% of extra boost")
    }

    fun doSomethingSpecial() = println("NA NA NA NA NA NA Batman!")
}