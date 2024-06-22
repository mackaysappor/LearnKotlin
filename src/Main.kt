import kotlin.time.measureTime

/*
* "fun" is used to declare functions
* main() is where the program starts from*/

/**
 * VARIABLES
 * val and var are used to declare variables
 * val is for read only variables or immutable variables(in java the equivalent is final)
 * const is for constants; known values before execution (equivalent in java is static final)
 * Kotlin uses type inference to determine what data type the variable is using so there's no need for
 * explicitly adding the data type for variables
 */
val name = "Mackay"
var customers = 10

fun main(){
    println("Hello World!")
    println("Hello "+name)

    var cost : Int // to declare a variable without initialization specify its type with ":"

    /**
     * Exercise - Variables
     * Find the sum of two numbers
     */

    val firstNumber = 4
    val secondNumber = 5
    val sum = firstNumber + secondNumber
    println("The sum of $firstNumber and $secondNumber is $sum")
}


