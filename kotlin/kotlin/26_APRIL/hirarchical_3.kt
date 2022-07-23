open class Electronics
{

    var item = "Technologies"

    fun showElectronics()
    {
       println("Electronics of : $item")
    }

}
open class Computer:Electronics()
{
    var system = "Cpu"

    fun showComputer()
    {
        println("Computer of : $system")
    }
}

open class Laptop:Electronics()
{
    var system1 = "spekar"

    fun showsystem1()
    {
        println("Leptop of : $system1")
    }
}

class mobile:Electronics()
{
    var system2 = "camera"

    fun showsystem2()
    {
        println("mobile of : $system2")
    }
}

fun main()
{
    var objm = mobile()
    var objl = Laptop()
    var objC = Computer()

    objm.showElectronics()
    objC.showComputer()
    objl.showsystem1()
    objm.showsystem2()
}