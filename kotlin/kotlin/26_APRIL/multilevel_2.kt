package `26_APRIL`

open class Trck
{
    var name1 = "non Ac"

    fun showTrck()
    {
        println("Trck is :$name1")
    }
}

open class car:Trck()
{
    var name2 = "Steering"

    fun showcar()
    {
        println("Car is : $name2")
    }
}

class Bike:car()
{
    var name3 = "handle"

    fun showBike()
    {
        println("Bike is : $name3")
    }
}

fun main()
{


    println("*******************************************************")
    var objBike = Bike()
    objBike.showTrck()
    objBike.showcar()
    objBike.showBike()

}