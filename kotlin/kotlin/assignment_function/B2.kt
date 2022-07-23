package assignment_function

fun start() : String
{
    print("Enter name : ")
    var name = readLine()!!
    println("name : $name")
    return  name
}

fun main()
{
    start()

}