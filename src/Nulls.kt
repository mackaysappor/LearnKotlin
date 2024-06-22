/**
* NULLS with KOTLIN
 * */
fun main() {
    var name = "Jamila"
    // name = null
/* In kotlin the above is not possible because the kotlin type system is aimed
    at eliminating the dangers of null references
    */

    var brand1: String? = "Mackay Labs" //for a variable to have a null value you put a '?' after the data type
    brand1 = null

    var brand2: String? = null
    println(brand2?.uppercase()) // when we call a null variable  you need to add the '?' when invoking a method on the variable
    // essentially the ? shows that a value can be null or not
}