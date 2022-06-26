fun main() {
    //HashMap can also be initialize
    // with its initial capacity.
    //The capacity can be changed by
    // adding and replacing its element.
    val hashMap: HashMap<String, Int> = HashMap<String, Int>(4)

    //adding elements to the hashMap using put() function
    hashMap.put("IronMan", 3000)
    hashMap.put("Thor", 100)
    hashMap.put("SpiderMan", 1100)
    hashMap.put("NickFury", 1200)

    for (key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }
    //returns the size of hashMap
    println("\n" + "hashMap.size : " + hashMap.size)

    //adding a new element in the hashMap
    hashMap["BlackWidow"] = 1000
    println("hashMap.size : " + hashMap.size + "\n")

    for (key in hashMap.keys) {
        println("Element at key $key : ${hashMap[key]}")
    }
}