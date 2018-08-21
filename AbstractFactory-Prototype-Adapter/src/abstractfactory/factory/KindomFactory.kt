package abstractfactory.factory

import abstractfactory.army.Army
import abstractfactory.castel.Castel
import abstractfactory.king.King

interface KindomFactory {

    fun createKing(): King

    fun createCastel(): Castel

    fun createArmy(): Army
}