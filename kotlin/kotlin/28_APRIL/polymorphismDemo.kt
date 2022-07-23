package `28_APRIL`

class shape
{
    private var side:Int = 0

    fun setside(side:Int)
    {
        this.side = side
    }
    fun area()
    {
        println("area of square : ${side*side}")
    }
    fun area(num:Float)
    {
        println("area of circle : ${3.14*num*num}")
    }
    fun area(length:Float,breadth:Float)
    {
        println("area of Rectangle : ${length*breadth}")
    }
}

fun main()
{
    var circle = shape()
    circle.area(10.0f)

    var rect = shape()
    rect.area(10.0f,10.0f)

    var square = shape()
    square.setside(20)
    square.area()

}