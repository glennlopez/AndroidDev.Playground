package demo

/*
 * Lambda functions are anonymous functions
 * It allows you to write quick throw away functions without naming them
 */

fun main ()
{
    var calcArea = {width: Int, height: Int -> width * height}
    println("calcArea 15 x 100: ${calcArea(15,100)}")
}