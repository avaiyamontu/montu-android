package assignment

fun main()
{

    var num = 123456
    var count = 0

    while (num != 0)
    {
        num /= 10
        count++
    }
    println("number of digit : $count")

}