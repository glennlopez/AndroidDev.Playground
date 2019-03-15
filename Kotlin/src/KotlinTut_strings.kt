package demo

fun main()
{
 /*
  * Strings: https://youtu.be/H_oGi8uuDpA?t=831
  */
    val myName = "Glenn Lopez"
    val longString = """This is
            a long string
            etc..."""
    var fName = "Ngoc"
    var lName: String = "Pham"
    fName = "Tu"
    var phamName = fName + " " + lName

    println("Pham Name: " + phamName + " (${phamName.length} characters long)\n")

    // Comparing strings
    val myFname1 = "Glenn"
    val myFname2 = "glenn"
    val myFname3 = "Glenn"
    println("Does Glenn == glenn: ${myFname1.equals(myFname2)}")
    println("Does Glenn == Glenn: ${myFname1.equals(myFname3)}")
    println("Does A == B: ${"A".compareTo("B")}")
    println("Does A == A: ${"A".compareTo("A")}")
    println("Does A == a: ${"A".compareTo("a")}")

    // Indexing through Strings
    var myString1 = "This is a random text"
    var myString2 = "This is another random thing"
    println("Second Index: ${myString1[2]}")
    println("Index 16 - 22: ${myString2.subSequence(16, 22)}")
    println("myString1 contains \"random\": ${myString1.contains("random")} ")
    println("myString1 contains \"poop\": ${myString1.contains("poop")} ")
    println()
}