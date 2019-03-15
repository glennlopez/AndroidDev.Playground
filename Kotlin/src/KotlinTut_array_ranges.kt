package demo

fun main ()
{
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
}