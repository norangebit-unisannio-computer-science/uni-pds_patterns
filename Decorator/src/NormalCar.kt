class NormalCar(val name: String): Car {

    override fun go() = println("50 Km/h")

    override fun run() = println("120 Km/h")
}