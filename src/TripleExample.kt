/*
* Kotlin language provides a simple datatype to store three values in a single instance.
* This can be done using a data class known as Triple. It is a simple generic class that stores any three values,
* there is no valuable meaning of the relationship between the three values. The comparison between two Triple objects
*  is done on the basis of values, i.e. two Triples are equal only if all three components are equal.

Class Definition:

data class Triple<out A, out B, out C> : Serializable
There are three parameters:

A – type of the first value
B – type of the second value
C – type of the third value
Constructor
In Kotlin, the constructor is a special member function that is invoked when an object of the class is created primarily to initialize variables or properties. To create a new instance of the Triple we use:

Triple(first: A, second: B, third: C)
Kotlin example of creating triple using the constructor:

Kotlin
fun main() {
val (x, y, z) = Triple(1, "Geeks", 2.0)
println(x)
println(y)
println(z)
}
Output:

1
Geeks
2.0
Properties
We can either receive the values of the triple in a single variable or we can use the first, second, and third properties to extract the values.

first: This field stores the first value of the Pair.
second: This field stores the second value of the Pair.
third: This field stores the third value of the Pair.*/
fun main() {
    // declare triple
/*
    var triple = Triple(
        "Hello PrAndroid",
        "This is Kotlin tutorial",
        listOf(100, 200, 300)
    )
    println(triple.first)
    println(triple.second)
    println(triple.third)
*/

    // first triple
    /*val triple = Triple("X", "Y", "z")
    println("String representation is "+triple.toString())*/

    // second triple
   /* val triple2 = Triple("PrAndroid",
        listOf("Abhi", "Akhi", "Bakkhi"),
        123)
    print("Another string representation is "+ triple2.toString())*/

    //Kotlin program of using the extended function:

    // first triple
    val obj = Triple(10, 20, 30)
    val list1: List<Any> = obj.toList()
    println(list1)

    // second triple
    val obj2 = Triple("Hello PrAndroid", 5.0000 ,
        listOf(100, 200, 300))
    val list2: List<Any> = obj2.toList()
    println(list2)
}
