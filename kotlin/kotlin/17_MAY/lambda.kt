package `17_MAY`

fun main()
{

    var greeting = { println("maa khodal") }

    greeting()

    var addTwonumber = {num1:Int , num2:Int -> println("summation : ${num1+num2}") }

    addTwonumber(25,25)

    var addThreenumbers = {num1:Int , num2:Int , num3:Int -> num1+num2+num3}

    println("addition of Three number : ${addThreenumbers(25,25,25)}")

    displayResult(23,addThreenumbers)
}

fun displayResult(num1:Int , myFunction:(Int,Int,Int) -> Int)
{
    var result = myFunction(25,25,26)
    println(result)
}