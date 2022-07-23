package `5_MAY`

fun main()
{
    println("program starts from hare................")

    try
    {

        var name:String? = "khodal"
        println("value of name : ${name!!.length}")

        var value  = "1234"
        println("value : ${value.toInt()+100}")

        var array = intArrayOf(11,12,13,14,15)
        println("index of 4 : ${array[4]}")

        var num = 22/2
        println("num : $num")

    }catch (e:NullPointerException)
    {
        println("NullPointerException Handled")

    }catch (e:NumberFormatException)
    {
        println("NumberFormatException Handled")

    }catch (e:ArrayIndexOutOfBoundsException)
    {

        println("ArrayIndexOutOfBoundsException Handled")

    }catch (e:ArithmeticException)
    {
        println("ArithmeticException Handled")
    }


}