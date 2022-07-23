package `26_APRIL`

import java.sql.RowId

class Item(var itemId: Int = 0,var itemname:String = "",var itemprice:Int = 0)
{

    init
    {
        println("itemId :$itemId, itamname : $itemname, itemprice : $itemprice")
    }

}

fun main()
{
    var i1 = Item(12,"shirt",550)
    var i2 = Item(1,"khodal",600)
}