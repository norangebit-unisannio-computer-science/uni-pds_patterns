package prototype

class NorthSoldier : Soldier,  Cloneable {
    private val description = "North soldier"

    override fun getDescription() = description

    override fun copy() = super.clone() as NorthSoldier

    override fun equals(other: Any?) = description == (other as Soldier).getDescription()
}