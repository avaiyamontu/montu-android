package Test

data class person(var name:String, var age:Int)

fun main()
{
    var data = person("khodal maa",19)
    println("name : ${data.name}")
    println("age : ${data.age}")
}