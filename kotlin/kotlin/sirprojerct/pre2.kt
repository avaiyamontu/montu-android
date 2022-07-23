package sirprojerct

fun main() {

    var num1 = 79
    var num2 = 23
    var num3 = 78

    var max: Int = if (num1 > num2 && num1 > num3) {
        num1
    } else if (num2 > num1 && num2 > num3) {
        num2
    } else {
        num3
    }
    println("$max is larget")
}