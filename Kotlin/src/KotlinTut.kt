package demo

fun main(): Unit {
    println("Hello World!")
    println("Hello Glenn...")



    /* Variable types:
     * Immutable (read only variables) - val
     * Mutable (change-able variables) - var
     */
        val name = "Glenn"
        var age = 19



    /* Type inference: https://youtu.be/H_oGi8uuDpA?t=525
     * Kotlin is able to understand what datatype
     * you are using but you can also define it yourself
     */
        var bigInt: Int =  Int.MAX_VALUE
        var smallInt: Int = Int.MIN_VALUE
        var fakeUniverseAge: Long = 1111111111111111111
        var fakeEarthAge: Double = 99999999999999999999.0

        var letterGrade = 'A'

        println("Biggest Int: " + bigInt)
        println("Smallest Int: $smallInt") //string interpolation
        println()

        print("Universe Fake Age: $fakeUniverseAge\n")
        println("Earth Fake Age: $fakeEarthAge")
        println("Total Earth + Universe: " + (fakeEarthAge + fakeUniverseAge) + " years old.")
        println()

        println("letterGrade var is a char: ${letterGrade is Char}")



    /*
     * Typecasting: https://youtu.be/H_oGi8uuDpA?t=731
     */
        println("Convert Double 1.567  to Int: ${1.567.toInt()}")
        println("Convert Char A to Int: ${letterGrade.toInt()}")
        println("Convert Int 68 to Char: ${68.toChar()}")
        println()



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




}