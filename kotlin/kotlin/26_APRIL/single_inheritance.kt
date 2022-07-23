package `26_APRIL`

open class A
{
    var a = 50

    fun showa()
    {
        println("value of a : $a")
    }
}

class B : A()
{
    var b = 55

    fun showb()
    {
        println("value of b : $b")
    }
}

fun main()
{
    var objA = A()
    var objB = B()

    objA.showa()
    objB.showb()
}