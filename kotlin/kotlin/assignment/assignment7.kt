//fun main(args: Array<String>) {
//
//    val dividend = 25
//    val divisor = 4
//
//    val quotient = dividend / divisor
//    val remainder = dividend % divisor
//
//    println("Quotient = $quotient")
//    println("Remainder = $remainder")
//}

fun main(args: Array<String>) {

    print("Enter the num1: ")
    var num1:Int = readln()!!.toInt()

    print("Enter the num2: ")
    var num2:Int = readln()!!.toInt()

    println(" Quotient : ${num1/num2}")
    println(" Remainder : ${num1%num2}")
}