fun main()
{
    //lets
    var name:String? = "maa khodal"

 /*   if (name!=null)
    {
        println("length to string : ${name?.length}")
    }*/

    var result = name?.let {

        "length to string : ${it.length}"
    }
    println(result)
}
