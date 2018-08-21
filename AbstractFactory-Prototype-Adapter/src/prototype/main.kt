package prototype

import abstractfactory.factory.DorneFactory
import abstractfactory.factory.NorthFactory
import abstractfactory.factory.RockFactory
import kotlin.system.exitProcess

fun main(args: Array<String>){

    if(args.isEmpty())
        exitProcess(1)

    val factory = when(args[0]){
        "north" -> NorthFactory()
        "rock" -> RockFactory()
        "dorne" -> DorneFactory()
        else -> exitProcess(1)
    }

    val king = factory.createKing()
    val castel = factory.createCastel()
    val army = ArmyAdapter(factory.createArmy())
    val soldierFactory = SoldierFactory(army.getCommander())
    val s1 = soldierFactory.createSoldier()
    val s2 = soldierFactory.createSoldier()

    println(king.getDescription())
    println(castel.getDescription())
    println(army.getDescription())
    println(s1.getDescription())
    println(s2.getDescription())
    println("equals: ${s1.equals(s2)}")
    println("=: ${s1 === s2}")
}

