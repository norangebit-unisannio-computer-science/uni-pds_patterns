class Leaf(private val name: String): Component {

    override fun print(prefix: String) {
        println("$prefix- $name")
    }
}