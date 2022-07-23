package `19_APRIL`

fun main()
{

    var value:String = "Tops technologies 65395 montu avaiya 3261555"
    var letter = 0
    var number = 0
    var space = 0

    for (i in value)
    {

        if(i.isLetter()) {
          letter++
        }
        else if(i.isDigit()) {
            number++
        }
        else if(i.isWhitespace()) {
            space++
        }

            /*i.isLetter() ->{
                letter++
            }
            i.isDigit() -> {
                number++
            }
           i.isWhitespace() ->{
                space++
            }*/
        }

    println("total letter : $letter")
    println("total number : $number")
    println("total space : $space")

    var length = value.length

    println("length of : $value  = $length")            // length

    var str1 = "Tops"
    var str2 = "tops"

    println("${str1==str2}")

    if (str1==str2)
    {
       println("Both of same")
    }
    else{
        println("Both of different")
    }

    // equal and equal ignore case

    println("equal : ${str1.equals(str2,ignoreCase = true)}")    //equa(l case

    var str3 = "Tops tech"          // get

    println("charcter is index 2 : ${str3.get(3)}")

    var reverse = str3.reversed()
    println(reverse)

    var str4 = "welcome to montu tops technologies"          // replace

    println("replce : ${str4.replace("tops","avaiya",ignoreCase = true)}")

     var str5 = "Addition/multiplace/Division/subtraction"          // split

    var list = str5.split("/", limit = 4)
    println(str5)

    for (element in list)
    {
        println(element)
    }

    var str6 = "welcome to montu avaiya tops technologies"     // substring

    var temp  = str6.substring(5..20)
    println(temp)

    println("to lowercase : ${str6.lowercase()}")
    println("to uppercase : ${str6.uppercase()}")

    var str7 = "montuavaiya@gmail.com "                 // trim
    println("length : ${str7.trim().length}")

    println("contains: ${str7.contains("moy")}")    //contains

    println("plus : ${str7.plus(str6)}")    // plue

}