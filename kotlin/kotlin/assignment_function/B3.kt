fun multiply()
{

    print("Enter num1 : ")
    var num1 = readLine()!!.toInt()

    print("Enter num2 : ")
    var num2 = readLine()!!.toInt()

    if (num1>0&&num2>0)
    {
        var mul = num1*num2
        println("multiply number is : $mul")
    }
}

fun main()
{
    multiply()

}