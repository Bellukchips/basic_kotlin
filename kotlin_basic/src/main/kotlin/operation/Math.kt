package operation

fun main() {
    val result = 10 / 3
    println(result)
    val result1 = 10.0 / 3.0
    println(result1)
    val result2 = 10 + 10 / 2
    println(result2)

    // argumented assignments
    var total = 0
    val barang1 = 100
    total += barang1
    val barang2 = 200
    total += barang2
    val barang3 = 50
    total += barang3

    println(total)

    // unary operator
    total++
    println(total)
    total--
    println(total)

    val suhu = -5
    println(suhu)
    val sehat = true
    println(!sehat)

    /**
     * 3
     * 3.3333333333333335
     * 15
     * 350
     * 351
     * 350
     * -5
     * false
     * **/
}