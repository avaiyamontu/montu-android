import java.io.File
import java.io.IOException

fun main()
{

    var Folder = "kotlin"
    var fileName = "khodal"

  try {

       var file = File("D:\\kotlin\\khodal")
       println("parth : ${file.absolutePath}")

       var root = File(file , Folder)

       if (!root.exists())
       {
          root.mkdir()
       }

       var mfile = File(root , fileName)

      mfile.delete()

      if (file.createNewFile())
      {
          println("create file successfully")
      }

   }catch (e:IOException)
   {
        println("error in creating file")
   }

}