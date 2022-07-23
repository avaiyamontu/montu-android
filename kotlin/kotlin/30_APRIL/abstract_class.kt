package `30_APRIL`

abstract class shape
{
    protected var num = 0

    fun setvalue(num:Int)
    {
        this.num = num
    }

    abstract fun area()
}

class circle : shape()
{
    override fun area()
    {
        println("area of circle : ${3.14*num*num}")
    }
}

class square : shape()
{
    override fun area()
    {
        println("area of area : ${num*num}")
    }
}

fun main()
{
    var c1 = circle()
    c1.setvalue(12)
    c1.area()

    var s1 = square()
    c1.setvalue(25)
    c1.area()

}