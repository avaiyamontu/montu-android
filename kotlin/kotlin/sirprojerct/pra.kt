//package sirprojerct
//
//fun main() {
//
//    var num = -45
//
//    var result = if (num > 0) {
//        println("positive number")
//        "positive"
//    } else{
//        println("negative number")
//        "negative"
//    }
//    println("result : $result")
//}
//
//fun main() {
//
//    var num1 = 50
//    var num2 = 46
//    var num3 = 47
//
//    var max: Int = if (num1>num2 && num1>num3){
//        num1
//    }else if (num2>num2 && num2>num3){
//        num2
//    }else{
//        num3
//    }
//    println("$max is larget")
//}
//
//fun main() {
//
//        var num1= 88
//    var num2 = 56
//    var num3 = 57
//
//    var max: Int = if (num1>num2){
//
//            if (num1>num3){
//                num1
//            }else{
//                num3
//            }
//    }else{
//        if (num2 > num3){
//            num2
//        }else{
//            num3
//        }
//    }
//    println("$max is largest")
//}

//fun main() {
//
//    var num1 = 45
//    var num2 = 4
//
//    var msg = """
//        1) Addition
//        2) multipliaction
//        3) Division
//        4) subtraction
//    """.trimIndent()
//
//    println(msg)
//    print("Enter choice : ")
//
//    var choice = readLine()!!.toInt()
//
//    var result = when(choice){
//
//        1-> println("Addition : ${num1+num2}")
//        2-> println("multiplication : ${num1*num2}")
//        3-> println("division : ${num1/num2.toFloat()}")
//        4-> println("subtraction : ${num1-num2}")
//        else->("invalid input")
//    }
//}

fun main() {

        var num1 = 35
        var num2 = 7

        var msg ="""
            1) Addition
            2) Multiplication
            3) Division
            4) subtraction
        """.trimIndent()

        println(msg)
        print("Enter the choice: ")

        var choice = readLine()!!.toInt()

        var result = when(choice){

            1-> println("Addition : ${num1+num2}")
            2-> println("Multiplication : ${num1*num2}")
            3-> println("Division : ${num1/num2}")
            4-> println("subtraction : ${num1-num2}")
            else-> println("invalid input")
        }
}