fun main() {
    val str = "avaiya montu"
    val text = 'a'
    var value = 0

    for (i in 0..str.length - 1) {
        if (text == str[i]) {
            value++
        }
    }
    println("Frequency of $text = $value")
}