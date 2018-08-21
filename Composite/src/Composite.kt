class Composite(private val name: String): Component {
    private val componets = ArrayList<Component>()

    fun addComponent(c: Component) = componets.add(c)

    override fun print(prefix: String) {
        println("$prefix- $name")
        componets.forEach { it.print("$prefix\t") }
    }
}