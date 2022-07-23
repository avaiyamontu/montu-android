package `17_MAY`


fun main()
{

    var result = 45 greaterNumber 56

    println("largest number ; $result")

}

infix fun Int.greaterNumber(other:Int):Int
{
    return if (this>other) this else other
}

fun greater(num1:Int , num2:Int):Int
{
    return if (num1>num2) num1 else num2
}