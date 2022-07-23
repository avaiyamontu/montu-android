package `26_APRIL`

class Person(var id:Int,var name:String,var age:Int)
{

    private var email: String = ""

    constructor(id: Int, name: String, age: Int, email: String) : this(id, name, age)
    {
        this.email = email
    }

    fun show()
    {
        println("id : $id, name : $name, age : $age,email : $email")
    }
}

fun main()
{
    var p1 = Person(1,"khodal",18)
    var p2 = Person(1,"montu",18,"montu@gmail.com")
    p1.show()
    p2.show()
}