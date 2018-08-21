package abstractfactory.factory

import abstractfactory.army.NorthArmy
import abstractfactory.castel.NorthCastel
import abstractfactory.king.NorthKing

class NorthFactory: KindomFactory {

    override fun createCastel() = NorthCastel()

    override fun createArmy() = NorthArmy()

    override fun createKing() = NorthKing()
}