
fun main() {

    //Pair example in Kotlin.
    //Kotlin language provides a simple datatype to store two values in a single instance.
    // This can be done using a data class known as Pair. It is a simple generic class that can store two values of same
    // or different data types, and there can or can not be a relationship between the two values. The comparison between
    // two Pair objects is done on the basis of values, i.e. two Pair objects are equal if their values are equal.
    // declare pair

    /*
    * data class Pair<out A, out B> : Serializable
    * Pair(first: A, second: B)
    *
    * Properties –
    We can either receive the values of pair in a single variable or we can use first and second properties to extract the values.
    first: This field stores the first value of the Pair.
    second: This field stores the second value of the Pair.
    */

    /*var pair = Pair("Hello Ravindra", "This is Kotlin tutorial")
    println(pair.first)
    println(pair.second)*/

    //take pair as objject
   /* val obj = Pair(5,5)
    println("String representation is "+obj.toString())
    val pair = Pair("Prandroid", listOf("Ravindra", "Ashwini", "Arjun"))
    print("Another string representation is "+pair.toString())*/

    // first pair
    var obj = Pair(1,2)
    val list1: List<Any> = obj.toList()
    println(list1)
    // second pair
    var obj2 = Pair("Hello","PrAndroid")
    val list2: List<Any> = obj2.toList()
    println(list2)

}