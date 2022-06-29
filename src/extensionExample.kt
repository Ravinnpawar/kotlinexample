

//Extension Function Kotlin
//IT gives us the capability to execute the additional function over existing class object.
//Kotlin extension function provides a facility to "add" methods to class without inheriting a class or using any type
// of design pattern. The extension function is declared with a prefix receiver type with method name.
// The created extension functions are used as a regular function inside that class.
fun main() {
    //First Example is simple extension function added on String Class.
    val name="Ravindra Prandroid".formatString()
    println(name)

    //Second Example with Student Class
    val student=Student()
    val passingStatus=student.isPassed(55)
    println("Student Passing status is: $passingStatus")

    val excellentStatus=student.isExcellent(95)
    println("Student Excellent Status is: $excellentStatus")

 }
fun String.formatString(): String {
    return "----------------------\n$this\n---------------------"
}
class Student{
    fun isPassed(mark:Int):Boolean{
        return mark>40
    }
}
fun Student.isExcellent(mark:Int):Boolean{
    return mark>90
}


