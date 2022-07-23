package assignment

fun main()
{

    println("Enter number: ")
    var a:Double = readln()!!.toDouble()

    println("Enter number: ")
    var b:Double = readln()!!.toDouble()

    println("After swapping :$a and $b ")

    a = a + b
    b = a - b
    a = a - b

    println("Befor swapping :$a and $b")

}