package `19_MAY`

fun main()
{
    //immmutable
    var colorlist = listOf<String>("red","black","blue","black","pink","white")

    //size
    println("size of list : ${colorlist.size}")

    //get element on index based
    for (index in colorlist.indices)
    {
        println(colorlist[index])
    }

    //read element using for-each
    colorlist.forEach {
        println("$it")
    }

    var numlist = listOf<Int>(25,45)

    var sum = 0

    numlist.forEach {
        sum+=it
    }

    println("$sum")

}