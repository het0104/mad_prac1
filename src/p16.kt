fun main()
{
    print("Enter First Number:")
    var no1=readln().toInt()
    print("Enter Second Number:")
    var no2=readln().toInt()
    println(Add(no1,no2))
    println(sub(no1,no2))
    println(mul(no1,no2))
    println(div(no1,no2))
}
fun Add(no1:Int,no2:Int): Int
{
    return no1+no2
}
fun sub(no1:Int,no2:Int): Int
{
    return no1-no2
}
fun mul(no1:Int,no2:Int): Int
{
    return no1*no2
}
fun div(no1:Int,no2:Int): Int
{
    return no1/no2
}