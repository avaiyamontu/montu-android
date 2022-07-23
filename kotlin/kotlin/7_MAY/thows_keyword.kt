package `7_MAY`

class MyExecption(msg:String) : Exception(msg) {
}
class Agevalidator
    {
        fun validate(age:Int)
        {
            if (age>=18)
            {
                println("eligible to vote")
            }else {
                try {
                    throw MyExecption("not eligible")
                }catch (e:Exception)
                {
                    print(e.message)
                }
            }
        }
    }

fun main()
{
        var p1 = Agevalidator()
        p1.validate(24)
}