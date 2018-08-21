class RealImage(val file: String): Image {

    init {
        loadImage()
    }

    override fun displayImage() {
        println("displayng $file")
    }

    private fun loadImage(){
        println("loading $file")

        Thread.sleep(5000)
    }
}