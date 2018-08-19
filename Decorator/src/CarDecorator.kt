open class CarDecorator(private val car: Car): Car {

    override fun go() = car.go()

    override fun run() = car.run()
}