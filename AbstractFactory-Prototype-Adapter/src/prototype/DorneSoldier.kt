package prototype

class DorneSoldier : Soldier, Cloneable {

    private val description = "Dorne soldier"

    override fun getDescription() = description

    override fun copy() = super.clone() as DorneSoldier

    override fun equals(other: Any?) = description == (other as Soldier).getDescription()
}