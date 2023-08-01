package type_data

fun main() {
    val firstName : String = "Lukman"
    val lastName : String = "Akbar"

    val address : String = """
        |Negara indonesia
        |Jawa Tengah
        |Tegal""".trimMargin()
    val address2 : String = """
        >Negara indonesia
        >Jawa Tengah
        >Tegal""".trimMargin(">")
    val address1 :String = """
        asdsd
        sdsd
        sdsds
        sdsds
    """.trimIndent()
    println(firstName)
    println(lastName)
    println(address)
    println(address1)
    println(address2)
    /** Output
     * Lukman
     * Akbar
     * Negara indonesia
     * Jawa Tengah
     * Tegal
     * asdsd
     * sdsd
     * sdsds
     * sdsds
     * Negara indonesia
     * Jawa Tengah
     * Tegal**/

    // String template
    var fullName :String = "$firstName $lastName"
    var totalFullName : String = "Total $fullName char = ${fullName.length}"
    println(fullName)
    println(totalFullName)
    /**
     * Lukman Akbar
     * Total Lukman Akbar char = 12
     * **/
}