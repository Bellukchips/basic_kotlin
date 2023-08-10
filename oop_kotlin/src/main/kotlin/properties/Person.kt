package properties

class Person {
    var firstName  = ""
    var middleName = ""
    var lastName = ""
}

fun main() {
    val person = Person()
    person.firstName = "Lukman"
    person.middleName = "Akbar"
    person.lastName = "AP"

    println(person.firstName)
}