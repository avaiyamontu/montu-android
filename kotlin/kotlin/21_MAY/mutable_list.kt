package `21_MAY`

fun main()
{

    var list = mutableListOf<Int>(11,12,13,14,15)

    //size
    println("size : ${list.size}")
    list.add(16)
    list.add(17)

    println("size : ${list.size}")
    var sum = 0

    list.forEach{
        sum+=it
    }

    println("sum : $sum")
    println(list)

}