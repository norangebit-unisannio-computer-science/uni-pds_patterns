package abstractfactory

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
    val army = factory.createArmy()

    println(king.getDescription())
    println(castel.getDescription())
    println(army.getDescription())
}