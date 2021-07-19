package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("June", "Kotlin")
    person.apply { this.skills = "Android" }
    println(person)  // Person(name=June, skills=Android)

    val returnObj = person.apply {
        name = "Lee"
        skills = "Java"
    }

    println(person)     // Person(name=Lee, skills=Java)
    println(returnObj)  // Person(name=Lee, skills=Java)
}