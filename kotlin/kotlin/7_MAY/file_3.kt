import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

fun main() {



    var Folder = "kotlin"
    var fileName = "khodal.txt"

    try {

        var file = File("D:\\khodal")
        println("parth : ${file.absolutePath}")

        var root = File(file, Folder)

        if (!root.exists())
        {
            root.mkdir()
        }

        var mfile = File(root, fileName)

        if (file.createNewFile())
        {
            println("create file successfully")
        }
        println("actual path : ${mfile.absolutePath}")

        var message = """
            1. read data from file
            2. write data from file
        """.trimIndent()

        println(message)

        print("Enter your choice : ")
        var choice = readLine()!!.toInt()

        when(choice)
        {
            1 -> readData(mfile)
            2 -> writeData(mfile)
                else -> "invalid input"
        }
    }catch (e:IOException)
    {
    println("error in creating file")
    }
}
fun writeData(mFile: File) {

    print("Enter message : ")
    var message = readLine()

    var fout = FileOutputStream(mFile.absolutePath, true)
    fout.write(message?.toByteArray())
    fout.close()

    println("data saved successfully")

}

fun readData(mFile: File)
{
    var fin = FileInputStream(mFile)
    //println("available size : ${fin.available()}")
    var byteArray = ByteArray(fin.available())
    fin.read(byteArray)

    // to convert byteArray into String
    var message = String(byteArray)
    println(message)

    fin.close()

}