package Test

fun main() {

    var fact = 1
    //var num = 6

    print("Enter the number : ")
    val num = readln()!!.toInt()

    for (i in 1..num)
        fact=fact*i

    println("factorial and $num: $fact")
}