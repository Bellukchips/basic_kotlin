package break_continue

fun main() {
    var i = 0
    while (true){
        println("Hello $i")
        i++
        if(i > 20){
            break
        }
    }


    for (i in 1..100){
        if(i % 2 == 0){
            println("Skip")
            continue
        }
        println(i)
    }
}