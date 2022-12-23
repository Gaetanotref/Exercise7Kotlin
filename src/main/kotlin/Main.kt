fun main() {
    val list1= listOf(1,2,3,12,123,42)
    val stringList1 = list1.map { it.toString() }
    println(stringList1)
    stringList1.forEach{it -> println(it)}
    //Verified if 1 is a string
    println(stringList1.contains("1"))
}