package abstractfactory.factory

import abstractfactory.army.RockArmy
import abstractfactory.castel.RockCastel
import abstractfactory.king.RockKing


class RockFactory: KindomFactory {

    override fun createCastel() = RockCastel()

    override fun createArmy() = RockArmy()

    override fun createKing() = RockKing()
}