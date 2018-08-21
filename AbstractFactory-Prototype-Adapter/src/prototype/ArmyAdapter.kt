package prototype

import abstractfactory.army.Army
import abstractfactory.army.DorneArmy
import abstractfactory.army.NorthArmy
import abstractfactory.army.RockArmy
import kotlin.system.exitProcess

class ArmyAdapter(private val oldArmy: Army): NewArmy {
    private val soldiers = ArrayList<Soldier>()
    private var commander: Soldier = when(oldArmy){
        is NorthArmy -> NorthSoldier()
        is DorneArmy -> DorneSoldier()
        is RockArmy -> RockSoldier()
        else -> exitProcess(1)
    }

    override fun getDescription() = oldArmy.getDescription()

    override fun addSoldier(s: Soldier) {
        soldiers.add(s)
    }

    override fun getCommander() = commander

}