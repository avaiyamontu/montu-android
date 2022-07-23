package collection_assignment

fun main()
{

        val list = listOf<String>("k", "h", "o", "d", "a" , "l")

        val array: Array<String> = list.toTypedArray()

        array.forEach {
            System.out.print(it)
        }

}