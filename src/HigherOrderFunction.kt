//Higher Order Function
//High order function (Higher level function) is a function which accepts function as a parameter or returns a
// function or can do both. Means, instead of passing Int, String,
// or other types as a parameter in a function we can pass a function as a parameter in other function.
class HigherOrderFunction {

}
fun main(){
    val fn:(String,String)->String={org,portal->"$org developed by $portal"}
    myFun("PRAndroid","Juzviral.in",fn)
}

fun myFun(org: String, portal: String,fn:(String,String)->String):Unit {
    val result=fn(org,portal)
    print(result)
}
