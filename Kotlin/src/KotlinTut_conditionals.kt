package demo

fun main ()
{
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
}