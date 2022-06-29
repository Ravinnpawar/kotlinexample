//Sealed Classes Example
//Sealed classes are commonly used with when expression. As the sub classes of sealed classes have their
// own types act as a case.
// Due to this, when expression in sealed class covers all the cases and avoid to add else clause.
// A sealed class is implicitly an abstract class which cannot be instantiated.
// Sealed class ensures the important of type-safety by restricting the set of types at compile time only.
// The subclasses of sealed classes must be declared in the same file in which sealed class itself.
// A sealed class defines a set of subclasses within it. It is used when it is known in advance that a type will conform to one of the subclass types.
// Sealed classes ensure type safety by restricting the types to be matched at compile-time rather than at runtime.
fun main(){
    var circle=Shape.Circle(5.0f)
    var square=Shape.Square(5)
    var rectangle=Shape.Rectangle(4,5)

    eval(circle)
    eval(square)
    eval(rectangle)
}

sealed class Shape{
    class Circle(var radius:Float):Shape()
    class Square(var len:Int):Shape()
    class Rectangle(var len: Int,var brdth:Int):Shape()

}

fun eval(e:Shape){
    when(e){
        is Shape.Circle-> println("Area of Circle is: ${3.14*e.radius*e.radius}")
        is Shape.Square-> println("Area of Square is: ${e.len*e.len}")
        is Shape.Rectangle-> println("Area Of Rect is: ${e.len*e.brdth}")
    }
}