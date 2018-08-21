class FiftyCreditHandler(next: CreditHandler?): CreditHandler(next) {

    override fun handle(amount: Int) {
        val r = amount%50
        val q = (amount-r)/50

        println("$q of 50")
        println("we can't give you $r")
    }
}