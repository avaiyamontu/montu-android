class person2()
{
     var id:Int = 0
    var name:String? = null
    var age:Int = 0
}

fun main()
{
    var person2 = person2().apply {
        id = 14
        name = "khodal"
        age = 27
    }

    person2.also {
        it.age = 25
        it.name = "maa"
    }.also {
        println("id : ${it.id} , name : ${it.name} , age : ${it.age}")
    }


}
