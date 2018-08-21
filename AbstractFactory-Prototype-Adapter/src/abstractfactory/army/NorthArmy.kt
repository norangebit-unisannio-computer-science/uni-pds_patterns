package abstractfactory.army

import abstractfactory.army.Army

class NorthArmy: Army {
    private val description = "North army"

    override fun getDescription() = description
}