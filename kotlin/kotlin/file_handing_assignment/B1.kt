package file_handing_assignment

import java.io.File

fun main()
{
    var file = File("C:\\Android\\khodal.txt")

    if (file.createNewFile())
    {
        println("create file successfully")
    }

}