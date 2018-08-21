package prototype

interface NewArmy {
    fun getDescription(): String
    fun addSoldier(s: Soldier)
    fun getCommander(): Soldier
}