/**
 * COLLECTIONS
 */

fun main() {
    executeLists()
}

/** ~ Lists ~
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
fun executeLists() {
    val readOnlyShapes = listOf("Triangle", "Square", "Circle")
    val mutableList: MutableList<String> = mutableListOf("Hexagon", "Pentagon", "Octagon")

    println(mutableList)
    mutableList.add("Rectangle")
    println("Modified shape list: $mutableList")
    println("First shape: ${mutableList.first()}") //retrieves first item in the list .last() is for the last item
}


/**
 * COLLECTIONS
 *
 * ~ Set ~
 * To create a read only list use setOf(); to create a mutable list use mutableSetOf()
 */

fun executeSets(){

}