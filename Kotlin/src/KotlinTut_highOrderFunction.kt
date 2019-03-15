package demo

fun main ()
{
    /*
     * Higher order function - https://youtu.be/H_oGi8uuDpA?t=3054
     * Is a function that accepts or returns another function
     */

    /*
    val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 }

    numList.forEach { x -> println("All: $x") }
    println()
    evenList.forEach { n -> println("Even: $n") }
    println()
    println()
    */

    val mult3 = makeMathFunc(3)
    println("(num1) multiply by mult3: ${mult3(5)}")

    val mult5 = makeMathFunc(5)
    println("(num1) multiply by mult5: ${mult5(5)}")

}

fun makeMathFunc (num1: Int): (Int) -> Int = {num2 -> num1 * num2}