package function

fun toUpper(value:String) : String = value.uppercase()
fun main() {
    // lamda expression
    val contohLamda : (String,String) -> String = { firstName: String, lastName:String ->
        val result = "$firstName $lastName"
        result
    }

    println(contohLamda("Lukman", "Akbar"))

    // it
    val sayHello : (String) -> String = {
        it.uppercase()
    }
    println(sayHello("hallo"))

    // method references
    val hello : (String) -> String = ::toUpper
    println(hello("skdjskdjskdjsd"))

    /**
     * Lukman Akbar
     * HALLO
     * SKDJSKDJSKDJSD
     * **/
}