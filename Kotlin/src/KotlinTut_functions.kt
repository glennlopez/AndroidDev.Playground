package demo

fun main(): Unit
{
    // nextTwo
    val numInput = 1
    val (return1, return2) = nextTwo(numInput)
    println("$numInput, $return1, $return2")

    // getSum
    println("Sum: ${getSum(1,2,3,4,5,6,7,8,9)}")
    println("Sum: ${getSum(5,5,10)}")
    println("Concat Strings: ${catString("Glenn", "Hipolito", "Lopez")}")


}




/*
 * Functions outside of Main() - https://youtu.be/H_oGi8uuDpA?t=2671
 */

    // accept 1 argument, return 2 values
    fun nextTwo (num: Int) : Pair<Int, Int>
    {
        return Pair(num + 1, num + 2)
    }

    // send MULTIPLE arguments, return 1 value
    fun getSum (vararg nums: Int) : Int
    {
        var sum = 0
        nums.forEach { n -> sum += n }
        return sum
    }

    fun catString (vararg names: String) : String
    {
        var cat = ""
        names.forEach { s -> cat += s }
        return cat
    }

    // higher order function
