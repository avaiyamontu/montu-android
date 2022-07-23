package collection_assignment

import java.util.*
import kotlin.collections.HashSet

fun main(args: Array<String>) {

    val array = arrayOf("a", "b", "c")
    val set = HashSet(Arrays.asList(*array))

    println("Set: $set")

}