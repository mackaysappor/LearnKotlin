import kotlin.time.measureTime

/*
* "fun" is used to declare functions
* main() is where the program starts from*/

/**
 * VARIABLES
 * val and var are used to declare variables
 * val is for constants
 * Kotlin uses type inference to determine what data type the variable is using
 */
val name = "Mackay"
var customers = 10

fun main(){
    println("Hello World!")
    println("Hello "+name)

    var cost : Int // to declare a variable without initialization specify its type with ":"

    /**
     * COLLECTIONS
     *
     * ~ Lists ~
     * To create a read only list use listOf(); to create a mutable list use mutableListOf()
     * List are ordered and allow duplicate items
     * Casting refers to when a mutable list is made read only by assigning it to a read only list
     *
     * For example
     * val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
     * val shapesLocked: List<String> = shapes
     *
     * .add() adds items to a list; .remove() removes items from a list
     */

    val readOnlyShapes = listOf("Triangle", "Square", "Circle")
    val mutableList: MutableList<String> = mutableListOf("Hexagon", "Pentagon", "Octagon")

    println(mutableList)
    mutableList.add("Rectangle")
    println("Modified shape list: $mutableList")
    println("First shape: ${mutableList.first()}") //retrieves first item in the list .last() is for the last item

}


