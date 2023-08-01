package type_data

fun main() {
    val range = 0..10 step 3
    println(range)
    println(range.count())
    println(range.contains(5))
    println(range.contains(100))
    println(range.first)
    println(range.last)
    println(range.step)

    println("==========")
    val reverse = 100 downTo 10 step 2
    println(reverse)
    println(reverse.count())
    println(reverse.contains(5))
    println(reverse.contains(100))
    println(reverse.first)
    println(reverse.last)
    println(reverse.step)


    /*
    * count()
    * contains(value)
    * first
    * last
    * step
    * */

    /**

    0..10
    11
    true
    false
    0
    10
    1
     *  **/
}