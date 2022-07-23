package Test

fun main()
{
    print("Enter the value : ")
    val ch = readln()!!.toString()

    when(ch)
    {
        "k","h","o","d","a","l" -> println("$ch is true")
        else -> println("$ch is false")
    }
}