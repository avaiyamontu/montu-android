package collection_assignment


fun main()
{
    var gujarat = hashMapOf<Int , String>(
        1 to "surat",
        2 to "jamnagar",
        3 to "rajkot",
        4 to "baroda"
    )
    var jamukasmir = hashMapOf<Int , String>(
        1 to "kasmir",
        2 to "manali",
        3 to "jambu"
    )
    var uttarpardesh = hashMapOf<Int , String>(
        1 to "dehli",
        2 to "agra"
    )

    var stat = hashMapOf<Int , String>(
        1 to "gujarat",
        2 to "jamukasmir",
        3 to "uttarpardesh"
    )

    for (i in stat.values)
    {
        if (i=="gujarat")
        {
            println("$i---${gujarat.values}")
        }
        else if (i=="jamukasmir")
        {
            println("$i---${jamukasmir.values}")
        }
        else{
            println("$i---${uttarpardesh}")
        }
    }
}