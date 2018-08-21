class ProxyImage(val file: String): Image {
    private var image: RealImage? = null

    override fun displayImage() {
        if(image==null) image = RealImage(file)
        image?.displayImage()
    }
}