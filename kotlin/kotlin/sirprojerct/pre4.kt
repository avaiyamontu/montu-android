package sirprojerct

fun main() {

    var num1 = 55
    var num2 = 56

    var msg = """
        1) addition
        2) multipliction
        3) division
        4) subtraction
        """".trimIndent()

    println(msg)
    print("Enter choice : ")

    var choice = readLine()!!.toInt()

    var result = when(choice)
    {
        1 -> println("Addition : ${num1+num2}")
        2 -> println("Multiplication : ${num1*num2}")
        3 -> println("Division : ${num1/num2.toFloat()}")
        4 -> println("Subtraction : ${num1-num2}")
        else -> println("invalid input")
    }
}