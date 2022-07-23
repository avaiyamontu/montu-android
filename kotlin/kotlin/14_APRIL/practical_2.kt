package `14_APRIL`

fun main()
{

    var str = "Flutter"

    var result = when(str)
    {
        "python","java","Dart","kotlin"->{

            "language"
        }
        "Angular","Flutter","React" ->{

            "frame work"
        }
        else -> "no frame work or language"
    }
    println("$str is $result")
}