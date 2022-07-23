package assignment_function

fun main(args: Array<String>) {
    val number = 50

    //print("Factors of $number are: ")
    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
}

