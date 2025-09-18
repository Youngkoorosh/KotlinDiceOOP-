fun main() {
    val mySixSidesDice = Dice(6)
    println("My first dice has ${mySixSidesDice.numSides} sides and rolled ${mySixSidesDice.roll()}")

    
	val myThenSidesDice = Dice(10) 	
    println("My first dice has ${myThenSidesDice.numSides} sides and rolled ${myThenSidesDice.roll()}")
}

class Dice(val numSides: Int){
    
    fun roll(): Int{
        return randomNumber = (1..numSides).random()
    }
}
