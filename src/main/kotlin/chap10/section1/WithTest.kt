package chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)
    val user = User("June", "default")

    val result = with (user) {
        skills = "Kotlin"
        email = "xxx@email.com"
    }
    println(user)  // User(name=June, skills=Kotlin, email=xxx@email.com)
    println("result: $result")  // result: kotlin.Unit
}