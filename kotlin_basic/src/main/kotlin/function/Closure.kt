package function

fun main() {
    var counter = 0
    val lambdaIncrement = {
        println("Lamda increment")
        counter++
    }

    val anonymousIncrement = fun(){
        println("Lamda anonymous increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    lambdaIncrement()
    anonymousIncrement()
    lambdaIncrement()
    anonymousIncrement()
    println(counter)
}
