import java.io.File

//package `7_MAY`
//
//import java.io.File
//
//fun main()
//{
//    var file = File("D:\\")
//
//    for (tmpFile in file.listFiles())
//    {
//        //println(fileName)
//
//        //var tmpFile = File(file, fileName)
//        println("fileName : ${tmpFile.name} => isFile : ${tmpFile.isFile}  isDir : ${tmpFile.isDirectory} isHidden : ${tmpFile.isHidden}" )
//    }
//
//}


fun main()
{
    var file = File("D:\\")

    for (mFile in file.listFiles())
    {
        println(mFile)
    }

}