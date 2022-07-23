package `3_MAY`

interface I1
{
    fun showA()

    fun show()
    {
        println("I1 show method called")
    }
}

interface I2
{
   // var b:String   //abstract property

    fun showB()     //abstract method
}

class myclass : I1,I2
{
    override fun showA()
    {
        println("showA method called")
    }

    override fun showB()
    {
        println("showB method  called")
    }
}

fun main()
{
    var obj = myclass()
    obj.show()
    obj.showA()
    obj.showB()

    //obj.a = 123
    //println("value of a : ${obj.a}")
}