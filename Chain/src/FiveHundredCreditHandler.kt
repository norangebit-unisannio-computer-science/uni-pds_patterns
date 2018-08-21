class FiveHundredCreditHandler(next: CreditHandler?): CreditHandler(next) {

    override fun handle(amount: Int) {
        val r = amount%500
        val q = (amount-r)/500

        println("$q of 500")
        forward(r)
    }
}