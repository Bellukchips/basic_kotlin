package function

import java.util.*

fun test(){
    println("Main")
}

// function parameter
fun name(first:String, last:String){
    println("$first $last")
}

// function default parameter
fun bio(name:String, address:String? = ""){
    println("$name $address")
}

// function named argument
fun fullName(firstName:String,lastName:String,address:String){
    println("Hello $firstName $lastName in $address")
}

// unit returning function
fun printHello(text:String?) : Unit{
    if (text == null){
        println("Hello")
    }else{
        println("Hello $text")
        println(getHello(text))
    }
}
// type returning function
fun getHello(text:String) : String{
    return text
}
fun add(a:Int,b:Int) : Int{
    return a+b
}

// single expression function
fun divide(a:Int,b:Int) :Int = a/b

// Varargs parameter
fun finalExamArray(values:Array<Int>) : Int{
    var total = 0
    for (value in values){
        total += value
    }
    return total
}
fun finalExam(vararg values:Int) :Int{
    var total = 0
    for (value in values){
        total += value
    }
    return total
}

// extension function
fun String.hello() : String  = "Hello $this"

// infix notation function
infix fun String.to(type:String):String{
    //return if
    return if(type == "UP") {
        this.uppercase(Locale.getDefault())
    }else{
        this.lowercase(Locale.getDefault())
    }
}

infix fun Int.calc(type:String) : Int{
    // return when
    return when (type) {
        "x" -> {
            this * 10
        }
        "-" -> {
            this - 10
        }
        else -> {
            this + 10
        }
    }
}

// function scope
fun scopeMain(){
    fun  scope1(){}
}
fun te(){
  //  scope1()  Error
}
fun main() {
    test()
    name("Lukman","Akbar")
    bio("Akbar")
    bio("Akbar","in Slawi")
    fullName(firstName = "Lukman", lastName = "Akbar", address = "Slawi")
    printHello("Lukman")

    val result = add(10,20)
    println(result)
    println(divide(20,2))

    println(finalExamArray(arrayOf(10, 10,10,10,10)))
    println(finalExam(10,10,10,10,145))

    val name = "Lukman"
    println(name.hello())
    val address = "slawi" to "UP"
    println(address)

    val i = 10 calc "x"
    println(i)
}