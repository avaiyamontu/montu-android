package `21_MAY`

data class product(
    var pId : Int,
    var name : String,
    var mrp:Double,
    var discount:Float
){
    fun getsaleprice():Double
    {
        var dis = mrp*discount/100
        return mrp - dis
    }
}
fun main()
{
    var productlist = mutableListOf<product>()
    productlist.add(product(123,"MacBook pro",50000.00,5.0f))
    productlist.add(product(124,"Iphone",100000.00,50.0f))
    productlist.add(product(125,"Ipad",150000.00,90.0f))

    for (i in productlist.indices)
    {
        var p = productlist[i]
        println("name : ${p.name} price : ${p.mrp}")
    }
    println("***********************")
    productlist.forEach()
    {
        println("name : ${it.name} price : ${it.mrp} saleprice : ${it.getsaleprice()} ")
    }
}