class TwoHundredCreditHandler(next: CreditHandler?): CreditHandler(next) {

    override fun handle(amount: Int) {
        val r = amount%200
        val q = (amount-r)/200

        println("$q of 200")
        forward(r)
    }
}