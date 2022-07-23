//fun main(args: Array<String>) {
//    var rows = 5
//
//    for (i in 1..rows){
//        for (j in 1..i){
//            print("$j ")
//        }
//        println()
//    }
//}

//fun main() {
//    var rowS = 5
////    var N = Int
//    for(i in 1..rowS){
//        for (j in 1..rowS-i){
//            print(" ")
//        }
//        for (k in 1..i){
//            print("*")
//        }
//        println()
//    }
//}

fun main() {
    var rows = 5
    var k = 0

    for (i in 1..rows){
        for(space in 1..rows-i){
            print(" ")
        }
        while(k != 1 + i - 1){
            print("* ")
            k++
        }
        println("")
        k = 0
    }

}