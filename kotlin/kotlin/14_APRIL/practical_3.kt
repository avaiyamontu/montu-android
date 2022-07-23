package `14_APRIL`
// when use with conditions
fun main()
{

    var num = 22

    var result = when(num)
    {
        0,11-> "0 or 11"
        in 1..10 -> "in range 1 to 10"
        !in 12..20 -> "not in 12-20"
        else -> "invalid input"
    }
    println("$result")

}