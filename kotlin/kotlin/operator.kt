import javax.print.attribute.standard.MediaSize.Other

fun main() {
    var num = 20

    //arithmetic operator
    num = num.plus(other =  34)

    if (num%2==0)
        println("even")
    else
        println("odd")

    //assignment operator
    var x = 34


    x+=10                //x = x+10
    println("value of x : $x")

    // Increment and Decrement (++, --)
    // prefix and postfix


    println("value of x (prefix) : ${++x}")         // postfix
    println("value of x (postfix) : ${x++}")         // postfix
    println(x)

    // Comparison operator (> , < , >=, <= , == !=)

    var num1 = 45
    var num2 = 45

    println("equals : ${num1!=num2}")

    // logical operator (&& , !!, !)

    var n = 10

    println("&& : ${n>10 && n<50}")
    println("! : ${!(n==10)}")
}