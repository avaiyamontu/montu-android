package assignment

fun main()
{
   println( """
       enter the choice:
        1) EN
        2) FR
        3) It
      """)
    print("Enter choice : ")
    var choice = readLine()!!.toInt()
    var result = when(choice){
        1-> println(" hello")
        2-> println("salut")
       3-> println("Ciao")
        else ->("invalid input")
    }
    println("result :${result}")
}