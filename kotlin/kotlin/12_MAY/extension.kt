fun main()
{
    var str = "maa"

    var result = str.concatTwoString(" khodal")
    println(result)
}

//extension
fun String.concatTwoString(other:String):String
{
    return this+other

}