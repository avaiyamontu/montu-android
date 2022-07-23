package array_assignment

fun main()
{
     var numArray = doubleArrayOf(23.4,53.2,355.2)
    var largest = numArray[0]

    for (num in numArray)
    {
        if (largest < num)
            largest = num
    }
    println("largest element = %.2f".format(largest))
}