//Lambda is a function which has no name. Lambda is defined with a curly braces {}
// which takes variable as a parameter (if any) and body of function.
// The body of function is written after variable (if any) followed by -> operator.
//Syntax----- { variable -> body_of_function}
//
class LambdaFunctionExample {

}
fun main(){
    //Normal function: addition of two numbers
    val myLambda:(Int)->Unit={s:Int->println(s)}
    addnumbers(1,2,myLambda)
}

fun addnumbers(a: Int, b: Int, myLambda: (Int) -> Unit) {
    val add=a+b;
    println("Program Is running for PRandroid as Lambda Functions")
    myLambda(add)
}
