package demo

import java.util.Random

fun main ()
{
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
}