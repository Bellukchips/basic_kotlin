package operation

fun main() {
    /*
    * &&
    * ||
    * !
    * */

    val nilaiUjian = 80
    val nilaiAbsen = 70

    val isLulus = nilaiUjian > 75
    val isLulusAbsen = nilaiAbsen > 70

    val result = isLulus || isLulusAbsen
    println(result)
}