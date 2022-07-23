package sirprojerct

fun main()
{

    var num = 10

    for (i in 1..num)
    {
        println("$i")
    }

    println()
    num =  15

    for (i in 1 until num+1)
    {
        println("$i  ")
    }

    println()
    num = 10

    for (i in num downTo 1)
    {
        println("$i  ")
    }

    println()

    for (i in 1..num step 3 )
    {
        println("$i  ")
    }

}