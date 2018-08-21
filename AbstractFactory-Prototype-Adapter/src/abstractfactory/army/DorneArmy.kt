package abstractfactory.army

import abstractfactory.army.Army

class DorneArmy: Army {
    private val description = "Dorne army"

    override fun getDescription() = description
}