package type_data

fun main() {
    val age : Byte = 30
    val height : Int = 200
    val distance: Short = 2000
    val balance: Long = 1000000L
    val weight : Float = 68.5F
    val width : Double = 10.13

    // binary
    val binary : Int = 0b010101010101
    // hexadecimal
    val hexadecimalLiteral : Int = 0xFF
    // underscore
    val money: Long = 10_000_000L

    println(age)
    println(height)
    println(distance)
    println(balance)
    println(weight)
    println(width)
    println(binary)
    println(hexadecimalLiteral)
    println(money)

    // conversion
    val number: Int = 100
    var convertToByte : Byte = number.toByte()
    var convertToShort : Short = number.toShort()
    var convertToLong : Long = number.toLong()
    var convertToFloat : Float = number.toFloat()
    var convertToDouble : Double = number.toDouble()
    println("$convertToByte, $convertToShort, $convertToLong, $convertToFloat, $convertToDouble")
    //Test Output
    /**
    30
    200
    2000
    1000000
    68.5
    10.13
    1365
    255
    10000000
    100, 100, 100, 100.0, 100.0
     */
}