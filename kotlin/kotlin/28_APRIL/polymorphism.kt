package `28_APRIL`

open class A
{
    open fun show()
    {
        println("class A method called")

    }

    open fun calcutaer(num1:Int,num2:Int)
    {
        println("addition : ${num1+num2}")
    }
}

class B:A()
{
    override fun show()
    {
        println("class B method called")
    }
    override fun calcutaer(num1: Int,num2: Int)
    {
        super.calcutaer(num1,num2)
        println("subtrection : ${num1-num2}")
    }
}

fun main()
{
    var objA = A()
    objA.show()

    var objB = B()
    objB.show()
    objB.calcutaer(25,10)
}