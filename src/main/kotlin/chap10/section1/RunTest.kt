package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("June", "Kotlin")
    val returnObj = person.apply {
        this.name = "Lee"
        this.skills = "Android"
        "success"
    }
    println(person)     // Person(name=Lee, skills=Android)
    println(returnObj)  // Person(name=Lee, skills=Android)

    val returnObj2 = person.run {
        this.name = "Kim"
        this.skills = "C++"
        "success"
    }
    println(person)      // Person(name=Kim, skills=C++)
    println(returnObj2)  // success
}