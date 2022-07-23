package assignment

fun main(args: Array<String>) {

    var num1 = 0
    var num2 = 1

    for (i in 1..7){

        print("$num1 + ")
        var sum = num1+num2
        num1=num2
        num2=sum
    }
}