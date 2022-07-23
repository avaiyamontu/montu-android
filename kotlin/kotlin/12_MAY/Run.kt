class person3()
{
    var id:Int = 0
    var name:String? = null
    var age:Int = 0
}

fun main()
{
    var person3 = person3().apply {
        id = 29
        name = "avaiya"
        age = 21

    }
    var name:String? = "khodal"

    var result = name?.let{
        "length of string : ${it.length}"
    }

    result?.run {
        println("length of a string : $length")
        println("${isEmpty()}")
        println("${substring(2..4)}")
    }

    println(result)

}