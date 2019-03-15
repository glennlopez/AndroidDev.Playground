package demo

fun main ()
{
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