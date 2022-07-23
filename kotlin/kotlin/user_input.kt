fun main() {

    print("enter num1: ")       //contive string to int
    var num1:Int = readln()!!.toInt()

    print("enter num2: ")       //contive string to float
    var num2:Float = readln()!!.toFloat()

    println("addition of $num1 and $num2 :${num1+num2}")

    //string input
    print("enter  name: ")
    var name:String = readln()!!.toString()
    println("name : $name")

    //char input
    print("enter charchter: ")
    var Ch:Char = readln()!![0]
    println("value of ch : $Ch")
}