package collection_assignment

//fun main(args: Array<String>) {
//
//    var capitals = mutableMapOf<String, String>()
//    capitals.put("Nepal", "Kathmandu")
//    capitals.put("India", "New Delhi")
//    capitals.put("United States", "Washington")
//    capitals.put("England", "London")
//    capitals.put("Australia", "Canberra")
//
//    val map = capitals.toList().sortedBy { (_, value) -> value}.toMap()
//
//    for (entry in map) {
//        print("Key: " + entry.key)
//        println(" Value: " + entry.value)
//    }
//}
fun main() {

    var map = mutableMapOf<String,String>("k" to "b" ,"h" to "a" , "o" to "c")
    val sorted = map.toSortedMap()
    println(sorted.values)
    println(sorted.values)

}