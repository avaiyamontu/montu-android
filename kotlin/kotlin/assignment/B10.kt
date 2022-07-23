package assignment

fun main() {

    var fact = 1

    var num = 6

    for (i in 1..num)

        fact=fact*i

    println("factorial and $num: $fact")
}