package abstractfactory.army

import abstractfactory.army.Army

class RockArmy: Army {
    private val description = "Rock army"

    override fun getDescription() = description
}