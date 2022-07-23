fun main(args: Array<String>) {

        print("Enter a num: ")

        val stringInput = readLine()!!

        // converts the string input to integer
        var integer:Int = stringInput.toInt()

        println("You entered: $integer")
}