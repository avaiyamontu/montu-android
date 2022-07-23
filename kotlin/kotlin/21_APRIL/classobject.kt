class student()
{
    var name :String = ""
    var rollno:Int = 0
    var course:String = ""
    var contact:String = ""

    fun setdata(r:Int, n:String,c:String, co:String)
    {
        rollno = r
        name = n
        course = c
        contact = co
    }

    fun showDatail()
    {
        println("rollno:$rollno, name : $name, coruse : $course, contact : $contact")
    }
}

fun main()
{
    var s1 = student()

    s1.rollno = 1
   s1.name = "montu"
    s1.course = "Android"
    s1.contact = "9537740426"

     var s2 = student()
    s2.setdata(1,"vinay","flutter","1234567891")

    s1.showDatail()
    s2.showDatail()

}