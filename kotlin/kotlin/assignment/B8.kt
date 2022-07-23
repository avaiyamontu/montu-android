package assignment

fun main()
{
    println("enter the alphabet")
    var c = readLine()!!

    if(c in "a".."z" || c in "A".."Z")
    {
        println("$c in alphabet")
    }else
    {
        println("$c in not alphabet")
    }

}