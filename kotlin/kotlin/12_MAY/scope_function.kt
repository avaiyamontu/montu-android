data class  Item(var Id : Int , var name : String , var price : Float = 0.0f)
{
    fun display()
    {
        println("Id : $Id ,name  : $name , price : $price")
    }
}

class person()
{
    var id:Int = 0
    var name:String? = null
    var age:Int = 0
}

fun main()
{
    //apply
    var item = Item(12,"khodal",9054.0f)
    item.display()

    Item(1, "fastrank").apply {

        price = 5050.00f
        println(this)
    }

    var person = person().apply {
        id = 11
        name = "montu"
        age = 18

    }
    println("Id : ${person.id} ,name  : ${person.name} , age:${person.age}")

}