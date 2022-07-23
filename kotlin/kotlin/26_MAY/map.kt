package `26_MAY`

fun main()
{

    var map = mapOf<Int, String>(1 to "Java" , 2 to "Android" , 3 to "Ios")

    var value = map[3]
    println("value : $value")

    for (key in map.keys)
    {
        println(key)
    }

    for (value in map.values)
    {
        println(value)
    }

    println("size of map : ${map.size}")

    for (entry in map.entries)
    {
        println("key : ${entry.key} value : ${entry.value}")
    }

    map.forEach{(key,value) -> println("key :$key  value :$value") }

    var mmap = mutableMapOf<Int,String>()
    mmap[54] = "Red"
    mmap[90] = "blue"
    println(mmap)

    //remove
    print("Remove element from map : ")
    var key = readLine()!!.toInt()
    mmap.remove(key)

    println(mmap)

    //replace
    mmap[11] = "White"
    mmap[12] = "pink"

    println(mmap)
}

