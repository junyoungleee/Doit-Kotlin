package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person : Person by lazy {
        isPersonInstantiated = true
        Person("Lee", 23)
    }

    val personDelegate = lazy {Person("Kim", 42)}

    println("person Init : $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}