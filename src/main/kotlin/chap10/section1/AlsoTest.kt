package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("June", "Kotlin")
    val a = person.let {
        it.skills = "Android"
        "success"
    }
    println(person)   // Person(name=June, skills=Android)
    println("a: $a")  // a: success

    val b = person.also {
        it.skills = "Java"
        "success"
    }
    println(person)   // Person(name=June, skills=Java)
    println("b: $b")  // b: Person(name=June, skills=Java)
}