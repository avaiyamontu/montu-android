//import java.io.File
//import java.io.FileOutputStream
//import java.io.IOException
//
//fun main()
//{
//    var Folder = "Android"
//    var filename = "kotlin.txt"
//
//    try
//    {
//            var File1 = File("C:\\kotlin")
//            println("parth : ${File1.absolutePath}")
//
//        var root = File(File1 , Folder)
//
//        if (!root.exists())
//        {
//            root.mkdir()
//
//        }
//        var mFile1 = File(root , filename)
//
//        if (File1.createNewFile())
//        {
//            println("create file successfully")
//        }
//        println("parth : ${mFile1.absolutePath}")
//
//        var message = """
//            1. write data from file
//        """.trimIndent()
//
//        println(message)
//
//        print("Enter your choice : ")
//        var choice = readLine()!!.toInt()
//
//        when(choice)
//        {
//            1 -> writeData(mFile1)
//            else -> "invalid input"
//        }
//    }catch (e:IOException)
//    {
//        println("error in creating file")
//    }
//}
//
//fun writeData(mFile1 : File)
//{
//    print("Enter message : ")
//    var message = readLine()
//
//    var fout = FileOutputStream(mFile1.absolutePath, true)
//    fout.write(message?.toByteArray())
//    fout.close()
//
//    println("data saved successfully")
//
//}