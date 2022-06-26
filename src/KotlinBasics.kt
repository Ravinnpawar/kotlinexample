fun main() {

    var a: Int? = null
    // using let function
    a?.let {
        // statement(s) will
        // not execute as a is null
        print(it)
    }
    // re-initializing value of a to 2
    a = 2
    a.let {
        // statement(s) will execute
        // as a is not null
        print(it)
    }


    /*val obj=Company().apply{
        name="Ravindra"
        objective="To Know Myself"
        founder="Madlur"
    }
    println(obj.name)
}
class Company{
    lateinit var name: String
    lateinit var objective:String
    lateinit var founder:String*/
}