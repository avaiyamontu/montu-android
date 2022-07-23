package `26_APRIL`

open class Cat
{
    var name = "Eat"

    fun showCat()
    {
        println("Cat is : $name")
    }
}

class Mouse : Cat()
{
    var name1 = "Cut"

    fun showMouse()
    {
        println("Mouse is : $name1")
    }
}

fun main()
{
    var objname = Cat()
    var objname1 = Mouse()

    objname.showCat()
    objname1.showMouse()

}