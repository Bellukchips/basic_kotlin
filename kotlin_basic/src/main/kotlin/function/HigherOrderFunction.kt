package function

fun main() {
    fun hello(name:String, transform: (String) -> String) : String{
        return "$name ${transform(name)}"
    }

    val upper = {value:String -> value.uppercase()}
    println(hello("Lukman", upper))

    // trailing lambda
    val result = hello("Lukman"){value:String ->
        value.lowercase()
    }
    println(result)
}