package `14_APRIL`


fun main()
{

    var value = 22

    when(value){

        1,3,5,7,9 ->{
            println("odd numbers: ")
        }
        2,4,6,8,10 ->{
            println("Even numbers: ")
        }
        else -> println("invalid input: ")
    }

}