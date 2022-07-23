package `30_APRIL`

open class Test2
{
    var num = 123

    protected fun show()
    {
    }
}

class Demo : Test2()
{
    fun display()
    {
        show()
    }
}

fun main()
{
    var T1 = Test2()

    var d1 = Demo()
}