package demo

fun main()
{
    println("5!: ${fact(5)}")
}

/*
 * Factorial - https://youtu.be/H_oGi8uuDpA?t=2916
 */

fun fact(x: Int): Int
{
    tailrec fun factTail(y: Int, z: Int): Int
    {
        // exit condition
        if (y == 0) return z
        else return factTail (y - 1, y * z)
    }
    return factTail(x, 1)
}