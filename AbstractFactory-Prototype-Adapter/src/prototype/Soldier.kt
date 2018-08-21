package prototype

interface Soldier {
    fun getDescription(): String

    fun copy() : Soldier
}