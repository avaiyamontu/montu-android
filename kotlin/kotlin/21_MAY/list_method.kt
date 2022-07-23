package `21_MAY`

fun main()
{
    var list = mutableListOf<String>()

    list.add("java")
    list.add("kotlin")
    list.add("python")
    list.add("c++")
    list.add("Dart")

    println(list)

    //remove
    list.remove("Dart")
    list.removeAt(2)
    println(list)

    list.add(1,"Dart")
    println(list)

    //addall
    var mlist = listOf<String>("Angular","c","Django")
    list.addAll(mlist)

    println(list)

    //Update
    list[2] = "PHP"
    list.add("c++")
    println(list)

    //indexof
    list[list.indexOf("Angular")] = "Hibernate"

    println(list)

    //clear
   // list.clear()

    print("Enter value : ")
    var value = readln()

    //contains
    if(list.contains(value))
    {
        list.removeAt(list.indexOf(value))
        println(list)
    }else{
        println("list does not contains this value")
    }

    //isEmpty
    println(list.isNotEmpty())

    println("lastindexof : ${list.lastIndexOf("c++")}")

    println(list)

    //reverse
    list.reverse()
    println(list)

    //shuffle
    list.shuffle()
    println(list)

    //sorting
    list.sort()
    println(list)

    list.sortDescending()
    println(list)

    list.sortBy { s :String -> s.length }

    println(list)

    //remove
   // list.removeIf { s : String -> s.length>3 }
    list.removeIf { s : String -> list.indexOf(s)%2==0 }
    println(list)

}