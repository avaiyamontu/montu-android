//fun main()
//{
//  val animal = "Montu"
//    if (animal == "Cat"){
//        println("Animal is Cat")
//    }
//    else if (animal == "Dog"){
//        println("Animal is Dog")
//    }
//    else if (animal == "Montu"){
//        println("Animal is Montu")
//    }
////    else{
////        println("Animal not found")
////    }
//    println("montu avaiya")
//    println("surat")
//    println("18")
//}

//fun main() {
//    var i =35
//    var j = 7
//
//    println(i + j)
//    println(i - j)
//    println(i / j)
//    println(i * j)
//}

fun main(args: Array<String>) {

    val year = 2016
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0)
        {
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}