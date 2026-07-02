fun main()
{
    var s1:String?="23"
    val a1: Int=s1!!.toInt()
    println(a1)
    print("Student Enrollment No:")
    var s2=readln().toLong()
    println(" Enrollment No:$s2")

    print("Student Name:")
    var s3=readln().toString()
    println("Name:$s3")

    print("Studnet Branch:")
    var s4=readln().toString()
    println("Branch:$s4")

    print("Studnet Class: ")
    var s5=readln().toString()
    println("Class:$s5")

    print("Studnet Batch: ")
    var s6=readln().toString()
    println("Batch:$s6")

    print("Studnet College Name:")
    var s7=readln().toString()
    println("College Name:$s7")

    print("Studnet University Name:")
    var s8=readln().toString()
    println("University Name:$s8")

    print("Studnet Age:")
    var s9=readln().toString()
    println("Age:$s9")
}