package `14_APRIL`

fun main()
{

    var nums = intArrayOf(54,41,25,65,32,45)

    nums.sort()

    println("size of an array : ${nums.size}")

    println("value at index 3 : ${nums[3]}")
    println("value at index 3 : ${nums.get(3)}")
    nums.set(3,36)  //set


    for (index in nums.indices){
        println("value at $index = ${nums[index]}")
    }

    for (element in nums)
    {
        if (element%2==0)
            println("$element = Even numbers")
        else
            println("$element = Odd numbers")

        println("index of $element : ${nums.indexOf(element)}")

    }

}