package function

 inline fun hello(name:()-> String) : String{
    return "Hello ${name()}"
}

inline fun says(first:()->String,noinline last:()->String) : String{
    return "Hello ${first()} ${last()}"
}
fun main() {
    println(hello { "Lukman" })
    println(hello { "Lukman" })
    println(says({"Lukman"},{"Akbar"}))
}