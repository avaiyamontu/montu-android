class person1()
{
    var id:Int = 0
    var name:String? = null
    var age:Int = 0
}

fun main()
{
    var person1 = person1().apply {
            id = 1
            name = "khodal"
            age = 18
    }

    println("ID : ${person1.id} , name : ${person1.name} , age : ${person1.age}")

    var p2 = with(person1)
    {
        name = "montu"
        println(this.name)
    }


}