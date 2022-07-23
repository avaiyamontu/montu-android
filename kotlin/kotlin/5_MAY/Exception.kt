package `5_MAY`

fun main()
{

    println("program starts from here..")

    try
    {
        var name:String? = "khodal"
        println("value of name : ${name!!.length}")

        var value = "3696"
        println("value : ${value.toInt()+100}")

        var array = intArrayOf(11,12,14,15,16,17)
        println("array of index 3 of : ${array[3]}")

        var num = 23 / 2
        println("value of num : $num")
    }
    catch (e:Exception)
    {
        println("e.message")
       // println("nullpointerException Handled")
       // e.printStackTrace()
    }
    finally
    {
        println("finally block executed")

    }

    println("All code executed")

}