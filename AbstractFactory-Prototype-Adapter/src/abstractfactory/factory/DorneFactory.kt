package abstractfactory.factory

import abstractfactory.army.DorneArmy
import abstractfactory.castel.DorneCastel
import abstractfactory.king.DorneKing


class DorneFactory: KindomFactory {

    override fun createCastel() = DorneCastel()

    override fun createArmy() = DorneArmy()

    override fun createKing() = DorneKing()
}