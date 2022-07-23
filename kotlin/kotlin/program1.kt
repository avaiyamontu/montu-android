import java.util.Scanner

//fun main()
//{
//    println("Hello World!!!")
//}

//fun main() {
//    var a:Number=45
//    var b:Number=45.55
//    println(a)
//    println(b)
//}

fun main(args: Array<String>) {
    val a:Int              //n
    var b = 0              //t1
    var c = 1              //t2

    print("enter no a--->")
    a= readln().toInt()

    for (i in 1..a) {
        print("$b + ")

        val sum = b + c
        b = c
        c = sum
    }
}