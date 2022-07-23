fun main()
{
    add()
    printTable(21)
    var res = maltiply()
    println("res : $res")
    for (element in getlanguages("language"))
    {
        println("$element")
    }
}

fun getlanguages(key:String = ""):Array<String>
{
    return  when (key)
    {
        "language" -> arrayOf("Dart","kotlin","python","c++","java")
        "framework" -> arrayOf("laravel","Angular","Flutter","React")
        else -> emptyArray()
    }
}

fun maltiply() : Int
{
    return  34 * 5
}

fun printTable(num:Int)
{
    for (i in 1..10)
        println(i * num)
}

// without return type without argument
fun add()
{
    var num1 = 45
    var num2 = 60

    println("addition : ${num1+num2}")
}