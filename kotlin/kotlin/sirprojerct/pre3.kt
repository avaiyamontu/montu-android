package sirprojerct

fun main() {

    var num1 = 58
    var num2 = 56
    var num3 = 57

    var max = if (num1 > num2){

            if (num1 > num3){
                num1
            }else{
                num3
            }

    } else{

            if (num2 > num3){

                num2
            }else{

                num3
            }
    }
    println("$max is larget")
}