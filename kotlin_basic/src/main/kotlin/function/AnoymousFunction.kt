package function

fun main() {
    fun hello(name:String, transform: (String) -> String) : String{
        return "$name ${transform(name)}"
    }

    val upper = fun(value:String) : String{
        return if(value.isBlank()){
            "Opps"
        }else{
            value.uppercase()
        }
    }


    println(hello("Lukkman", upper))
    println(hello("", upper))
    println(hello("Lukman", fun(value:String) : String{
        return if(value.isBlank()){
            "Opps"
        }else{
            value.uppercase()
        }
    }))
}