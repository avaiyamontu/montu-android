package Task

fun main()
{
    var list = mutableListOf<String>()
    var temp = true
    while (temp)
    {
        println("""
            1.add item
            2.remove item
            3.update item
            4.show item
            """.trimIndent())

        print("Enter the choice : ")

        when (readLine()!!.toInt())
        {
            1->
            {
                //additem
                print("Enter item  name : ")
                var value = readLine()!!
                list.add(value)
                println("item add successfully")
                println("are you want to countine(y/n)")
                temp = readLine()!!.lowercase()=="y"
            }
            2->
            {
                //remove item
                print("remove item :")
                while (true)
                {
                    if (list.remove(readLine()!!.lowercase()))
                    {
                        println("item remove sucessfully")
                        break
                    }else
                    {
                        println("list does not contains this item please Enter valid item:")
                    }
                }
                print("are you want to continue(y/n):")
                temp = readLine()!!.toString().lowercase()=="y"
            }
            3->
            {
                print("update item :")
                var oldvalue = readLine()!!
                while (true)
                {
                    var value = list.find { s ->s.equals(oldvalue, ignoreCase = true) }
                    if (value!=null)
                    {
                        print("Enter new item name:")
                        var newvalue = readLine()!!
                        list[list.indexOf(value)] = newvalue
                        println("item update successfully")
                        break
                    }else{
                        println("list does not contains this item please Enter valid item:")
                        break
                    }
                }
                print("are you continue (y/n) :")
                temp = readLine().toString().lowercase()=="y"
            }
            4->
            {
                println(list)
                println("are you continue (y/n) :")
                temp = readLine().toString().lowercase() =="y"
            }else ->{
                println("please Enter valid input:")
            }
        }

    }
    println("Thank you........................")

}