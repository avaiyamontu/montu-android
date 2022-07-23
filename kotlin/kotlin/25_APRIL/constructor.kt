package `25_APRIL`

class Test{
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var num4 = 0

    constructor(num1:Int,num2:Int)
    {
        this.num1 = num1
        this.num2 = num2
    }
    constructor(num1:Int,num2:Int,num3:Int)
    {
        this.num1 = num1
        this.num2 = num2
        this.num3 = num3
    }


    constructor(num1:Int,num2 : Int, num3:Int, num4:Int)
    {
        this.num1 = num1
        this.num2 = num2
        this.num3 = num3
        this.num4 = num4
    }

    fun add()
    {
        println("Addition : ${num1+num2+num3+num4}")
    }
}
fun main()
{
    var T1 = Test(5,5)
    T1.add()

    var T2 = Test(5,5,5)
    T2.add()

    var T3 = Test(4,4,4,4)
    T3.add()
}