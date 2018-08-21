import strategy.*

fun main(args: Array<String>){

    val king = Character(SingleSquare(null))
    val queen = Character(Cross(Diagonally(null)))
    val knight = Character(LShape(null))
    val rock = Character(Cross(null))
    val bishop = Character(Diagonally(null))
    val pawn = Character(SingleForward(null))

    println("King:\n${king.move()}")
    println("Queen:\n${queen.move()}")
    println("Knight:\n${knight.move()}")
    println("Rock:\n${rock.move()}")
    println("Bishop:\n${bishop.move()}")
    println("Pawn:\n${pawn.move()}")



}