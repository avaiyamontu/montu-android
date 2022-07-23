package `5_MAY`

fun main()
{
    println("program starts from here.........")

    try
    {
        var name:String? = null
        println("value of name : ${name!!.length}")

    }catch (e:NullPointerException)
    {
        println("NullPointerException Handled")
    }

    try
    {

        var value = "1234"
        println("value : ${value.toInt()+100}")

    }catch (e:NullPointerException)
    {
        println("NullPointerException Handled")
    }

    var array = intArrayOf(11,12,13,14,15,16)

    try
    {
        println("index of 3 : ${array[3]}")

    }catch (e:ArrayIndexOutOfBoundsException)
    {
        println("ArrayIndexOutOfBoundsException Handled")
    }

    try
    {
        var num = 22/2
        println("num : $num")

    }catch (e:ArithmeticException)
    {
        println("ArithmeticException Handled")
    }

    println("All code executed")
}