package assignment_function

fun stringlength(str:String):Int=str.length
fun checkEvenOdd(value :Int):String=if(value%2==0)"Even" else "odd"
fun compose(
    len :(String)->Int,
    evenodd :(Int)->String
):(String)-> String={
        str->evenodd(len(str))
}
val string:(String)->String=compose(::stringlength,::checkEvenOdd)

fun main() {
    println(string("maa khodal"))
}