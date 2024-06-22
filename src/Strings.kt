/**
 * Strings
 */

fun main() {
 val name = "Ahmed"
 println(name.length) // length is a property of a string

 // there are several methods that strings have and that can be called or invoked
 println(name.uppercase())
 println(name.lowercase())
 println(name[0]) // using the square brackets we can retrieve the characters in a string since strings are treated as arrays
 println(name[4])

 val age = 20
 val msg= name + " " + age // String concatenation
 val newMsg = "Name $name, Age:  $age" // using String templates is a better alternative to concatenation
 println(msg)
 println(newMsg)

 val email = """
  Hello, %s
  How
  Are you
 """.trimIndent() // this is for multi line strings and the indentation is kept as well
 println(email.format("Ana")) // using %s allow us to format a string as shown;  %d is for digits etc

 stringEquality()
}

/**
 * String Equality
 *
 * Comparing stringd
 * */

fun stringEquality(){
 val name1 = "Saleh"
 val name2 = "Jamila"
 val name3 = "Saleh"
 val name4 = String("Saleh".toCharArray())

 println(name1.equals(name3))
 println(name1 == name3)

 //both lines above will print true because .equals() & == compare the contents of the variable
// in kotlin to compare the memory location you use === as seen below

 println("=== ${name1 === name4}") // this is false
 println("=== ${name3 === name4}") // this is true


}