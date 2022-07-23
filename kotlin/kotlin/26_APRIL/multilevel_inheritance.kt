package `26_APRIL`

open class C
{
    var c = 60

    fun showc()
    {
        println("value of a :$c")
    }
}

open  class D : C()
{
    var D = 70

    fun showD()
    {
        println("value of b :$D")
    }
}

class E : D()
{
    var E = 80

    fun showE()
    {
        println("value of c: $E")
    }
}

fun main()
{
//    var objC = C()
    var objD = D()
    objD.showc()
    objD.showD()
    println("********************************************")
    var objE = E()
    objE.showc()
    objE.showD()
    objE.showE()
}