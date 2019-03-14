package demo

import java.util.Random

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
     * Kotlin is able to understand what data type
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
        println("myString1 contains \"random\": ${myString1.contains("random")} ")
        println("myString1 contains \"poop\": ${myString1.contains("poop")} ")
        println()




    /*
     * Arrays: https://youtu.be/H_oGi8uuDpA?t=1246
     */
        var myArray = arrayOf(1, 2, "Lopez", "Glenn", "B")
        myArray[4] = "A+"
        println("Arrays: ${myArray[0]} ${myArray[1]} ${myArray[2]} ${myArray[3]} ${myArray[4]}")
        println("Arrays: ${myArray.asList()}")
        println("Contains \"Glenn\": ${myArray.contains("Glenn")}")
        println("Contains \"glenn\": ${myArray.contains("glenn")}")
        println("Size of array: ${myArray.size}")
        println("First array: ${myArray.first()}")
        println("Last array: ${myArray.last()}")
        println("Index of \"Lopez\": ${myArray.indexOf("Lopez")}")

        // build an array ful of squares of size 5
        var sqArray = Array(20, { x -> x * x } )
        println("10^10: ${sqArray[10]}")
        println("Array of squares: " + sqArray.asList())

        // type specific array
        var intArray: Array<Int> = arrayOf(1,2,3) // try and add a char or string
        println("Int specific array: ${intArray.asList()}")
        println()




    /*
     * Ranges: https://youtu.be/H_oGi8uuDpA?t=1576
     */
        var oneToTen = 1..10
        println("oneToTen: ${oneToTen.toList()}")

        var tenToOne = 10.downTo(1)
        //println("tenToOne: " + tenToOne.toList())
        print("tenToOne: ")
        for(item in tenToOne.reversed()) print("${item} ") //reversed
        println()

        var sevenToThirty = 7.rangeTo(30)
        println("7 to 30: ${sevenToThirty.toList()}")

        var alphabet = "A".."Z"
        println("G is in alphabet range: ${"G" in alphabet}")

        var skip3_oneToTen = oneToTen.step(3)
        //println("1 - 10 stepping 3: ${skip3_oneToTen.toList()}")
        print("1 - 10 stepping in 3's: ")
        for (item in skip3_oneToTen)
        {
            print(item.toString() + " ")
        }
        println()
        println()




    /*
     * Conditionals: https://youtu.be/H_oGi8uuDpA?t=1796
     */
        // if - else conditionals
        val myAge = 8

        if (myAge < 5) println("Go to pre-school.")
        else if (myAge == 5) println("Go to kindergarten.")
        else if ( (myAge > 5) && (myAge <= 17) )
        {
            val grade = (myAge - 5)
            println("Go to grade $grade.")
        }
        else println("Go to College!")
        println()


        // when - replaces switch case statements
        // https://kotlinlang.org/docs/reference/control-flow.html
        val bearAge = 7

        when (bearAge)
        {
            0,1,2,3,4 -> println("Bear goes to pre-school.")
            5 -> println("Bear goes to Kindergarten")

            in 6..17 ->
            {
                val bearGrade = bearAge - 5
                println("Bear goes to grade $bearGrade")
            }
            else -> println("Bear goes to College.")
        }
        println()



    /*
     * Loops - https://youtu.be/H_oGi8uuDpA?t=2046
     */
        // for loops
        for (x in 1..10)
        {
            println("This is a loop: $x")
        }

        for (x in 1..20)
        {
            if (x % 2 == 0)
            {
                continue        // continue to the next iteration
            }
            println("Odd: $x") 

            if (x == 15) break // break o ut of the for loop
        }

        for (x in 1..10)
        {
            if (x % 2 != 0)
            {
                continue    // skips odd numbers
            }
            println("Even: $x")

            if (x == 8)
            {
                break // break out of for loop
            }
        }

        var myArray3: Array<Int> = arrayOf(3,6,9)
        for (i in myArray3.indices)
        {
            println("myArray[$i] is ${myArray3[i]}")
        }


        // while loop
        val magicNumber = Random().nextInt(50) + 1
        var guess = 0

        while (magicNumber != guess)
        {
            guess++
        }
        println("Magic Number (Random): $guess")
        println()




    /*
     * Functions inside Main() - https://youtu.be/H_oGi8uuDpA
     */
        // single-line functions
        fun add (num1: Int, num2: Int) : Int = num1 + num2
        println("Adding: 2 + 6 = ${add(2,6)}")

        // single-line function
        fun diff (num1: Int = 1, num2: Int = 5) = num1 - num2
        println("Adding: 30 + 6 = ${diff(30,6)}")  // with pre-defined
        println("Adding: default values = ${diff()}")           // with default value

        //
        fun helloWorld(msg2: String = "World", msg1: String = "Hello ") : String = msg1 + msg2
        println("${helloWorld()}")
        println("${helloWorld("Glenn")}")

        //
        fun sayHello(name: String) : Unit = println("Hello, $name")
        sayHello("Glenn")

        // function literals
        var multiply = {num1: Int, num2: Int -> num1 * num2}
        println("Function literal: ${multiply(5, 10)}")


}

