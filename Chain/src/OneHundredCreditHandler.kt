class OneHundredCreditHandler(next: CreditHandler?): CreditHandler(next) {

    override fun handle(amount: Int) {
        val r = amount%100
        val q = (amount-r)/100

        println("$q of 100")
        forward(r)
    }
}