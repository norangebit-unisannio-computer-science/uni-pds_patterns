
fun main(args: Array<String>){
    val fifty = FiftyCreditHandler(null)
    val one = OneHundredCreditHandler(fifty)
    val two = TwoHundredCreditHandler(one)
    val five = FiveHundredCreditHandler(two)

    five.handle(1980)
}