package `19_APRIL`

fun main()
{

    var name:String? = "montuavaiya"

    println("length : ${name?.length}")

    var num:Int? = 9054

    var value = num ?: 0
    println("value : $value")

    var str:String? = "montu "

    if (str!=null)
        println("length : ${str!!.length}")

}