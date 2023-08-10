package contructor

class Person(first:String,last:String) {
    var firstName = first
    var lastName = last
}

fun main() {
    var person = Person(first = "Lukman", last = "Akbar")
    println(person.firstName)

    person.firstName = "Akbar"
    println(person.firstName)
}