import java.io.FileOutputStream
import java.io.IOException
import java.io.File as File1

fun main() {

    var Folder = "kotlin"
    var fileName = "tops.txt"

    try {

        var file = File1("D:\\tops")
        println("parth : ${file.absolutePath}")

        var root = File1(file, Folder)

        if (!root.exists())
        {
            root.mkdir()
        }

        var mfile = File1(root, fileName)

        if (file.createNewFile())
        {
            println("create file successfully")
        }
        println("actual path : ${mfile.absolutePath}")

        var message = """
            1. write data from file
     """.trimIndent()
        println(message)

        print("Enter your choice : ")
        var choice = readLine()!!.toInt()

        when(choice)
        {
            1 -> writeData(mfile)
            else -> "invalid input"
        }

    }catch (e:IOException)
    {
        println("error in creating file")
    }
 }

fun writedata(mfile: File1)
{
    print("Enter message : ")
    var message = readLine()

    var fout = FileOutputStream(mfile.absolutePath,true)
    fout.write(message?.toByteArray())
    fout.close()

    println("data saved successfully")
}