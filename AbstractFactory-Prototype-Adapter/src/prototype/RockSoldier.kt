package prototype

class RockSoldier : Soldier, Cloneable {
    private val description = "Rock soldier"

    override fun getDescription() = description

    override fun copy() = super.clone() as RockSoldier

    override fun equals(other: Any?) = description == (other as Soldier).getDescription()
}