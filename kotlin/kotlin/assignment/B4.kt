package assignment

fun main() {

    var num1 = 45
    var num2 = 46
    var num3 = 47

    var max =  if(num1>num2){

            if (num1>num3){
                num1
            }else{
                num3
            }
    }else{
        if (num2>num3){
            num2
        }else{
            num3
        }
    }
    println("$max is largest")
}