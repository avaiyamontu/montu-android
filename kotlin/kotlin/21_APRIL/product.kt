class product
{
    var pId:Long = 0
    var name:String = ""
    var Color:String = ""
    var rating:Float = 0.0f
    var mrpprice:Int = 0
    var saleprice:Double = 0.0
    var offer:Double = 0.0
    var likes:Int = 0

    constructor(pId:Long,name:String,Color:String,rating:Float,mrpprice:Int,
                offer:Double,likes:Int)
    {
        this.pId = pId
        this.name = name
        this.Color = Color
        this.rating = rating
        this.mrpprice =mrpprice
        this.offer = offer
        this.saleprice = saleprice
        this.likes =likes
    }

    fun Getsaleprice():Double
    {
        var dis = mrpprice*offer/100
        var saleprice = mrpprice-dis
        return saleprice
    }
    fun showDatail()
    {
        println("pId : $pId, name : $name, color : $Color,rating : $rating, mrpprice : $mrpprice "+
                "likes : $likes,saleprice : ${Getsaleprice()}")
    }
}

fun main()
{
//    var s3 = product()
//
//    s3.pId = 20
//    s3.Color = "red"
//    s3.name = "Shirt"
//    s3.likes = 5000
//    s3.offer = 70.0
//    s3.rating = 430.0f
//    s3.mrpprice = 600
//
//    s3.showDatail()

    var p1 = product(1,"montu","red",450.0f,
        600,50.0,50)
    p1.showDatail()
}