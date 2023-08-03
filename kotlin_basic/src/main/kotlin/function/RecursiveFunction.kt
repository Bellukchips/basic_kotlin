package function



fun main() {
    fun factorialLoop(value:Int) : Int{
        var result = 1
        for (i in value downTo 1){
            result *=i
        }
        return result
    }

    fun factorialRecursive(value:Int) : Int{
        return when(value){
            1 -> 1
            else -> value * factorialRecursive( value - 1)
        }
    }
    println(factorialLoop(5))
    println(factorialRecursive(5))



    // tail recursive function
    tailrec fun display(value:Int){
        println("Recursive $value")
        if(value > 0){
            display(value - 1)
        }
    }
    display(10000)

    tailrec fun factorialRecursiveTail(value:Int, total:Int = 1) : Int{
        return when(value){
            1 -> total
            else ->  factorialRecursiveTail( value - 1, total * value)
        }
    }

    println(factorialRecursiveTail(10))
}