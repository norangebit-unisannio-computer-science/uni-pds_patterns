package prototype

class SoldierFactory(private val prototype: Soldier) {

    fun createSoldier() = prototype.copy()
}