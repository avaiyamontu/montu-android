fun maxvalue()
{

    var a = intArrayOf(1111111,2,10,4,5,9)
    var max = a[0]
    for (i in a)
    {
        if (max<i)
        {
            max = i
        }
    }
    println("max value : $max")
}

fun main()
{
    maxvalue()
}