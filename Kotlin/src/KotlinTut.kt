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
}

