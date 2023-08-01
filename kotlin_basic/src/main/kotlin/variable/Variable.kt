package variable


// variable constants
const val APP = "Kotlin Basic"
fun main() {
    // var  : untuk membuat variabel mutable / bisa diubah
    // val : untuk membuat variabel immutable / tidak bisa diubah
    var fullName : String = "Lukman"
    println(fullName)
    fullName = "Akbar"
    println(fullName)
    val name : String = "Aku"
    // name = "sds" (ERROR)

    // variable nullable
    var age: String? = null //
    age = "sds"
    println(age.length)
    println(APP)
    /**
     * Lukman
     * Akbar
     * 3
     * Kotlin Basic
     * **/
}