package `3_MAY`

data class user(
    var id:Int,
    var name:String,
    var email:String
    )


fun main()
{
    var user = user(1,"montu","montu@gmail.com")

    //toSrting
    println(user)

    var user1 = user(2,"khodal","khodal@gmail.com")

    //equals
    println(user==user1)

    //hasecode
    println(user.hashCode())
    println(user1.hashCode())

    //copy
    var user2 = user.copy(1,"khodal")
    println(user2)

    var(id:Int,name:String,email:String) = user2

    println("id : $id")
    println("name : $name")
    println("email : $email")

}