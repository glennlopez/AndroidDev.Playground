package demo

/*
 * Functions for manipulating lists - https://youtu.be/H_oGi8uuDpA?t=3262
 * Example: mathOnList function will take a List<T> and a function() and do the work
 * defined in the mathOnList function.
 */

fun main ()
{
    val multiplyBy2 = {num1: Int -> num1 * 2 }  // math function to multiply num1 by 2
    val numList2 = arrayOf(1,2,3,4,5)           // list containing numbers for num1

    // pass a list and a function to a function
    mathOnList(numList2, multiplyBy2)

}


// Accepts Array of Int List, and a Function(int) that returns -> int
fun mathOnList (numList: Array<Int>, myFunc: (num: Int) -> Int )
{
    for (num in numList)
    {
        println("mathOnList: ${myFunc(num)}")
    }
}