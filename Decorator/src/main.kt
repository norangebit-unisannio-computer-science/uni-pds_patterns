fun main(args: Array<String>){
    val car = NormalCar("Fiat 500")
    val batmobile = Batmobile(car)

    car.go()
    car.run()

    batmobile.go()
    batmobile.run()
    batmobile.doSomethingSpecial()


}