package `26_APRIL`

open class M
{
    var M = 90

    fun showM()
    {
        println("value of m : $M")
    }
}

open class O:M()
{
    var O = 50

    fun showO()
    {
        println("value of o : $O")
    }
}

class N : M()
{
    var N = 60

    fun showN()
    {
        println("value of N : $N")
    }
}

fun main()
{
   // var objM = M()
    var objO = O()
    objO.showM()
    objO.showO()

    println("*************************************************")

    var objN = N()
    objN.showM()
   // objN.showO()
    objN.showN()

}