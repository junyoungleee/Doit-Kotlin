package chap06.section1.customgetset

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        private set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }
    var age: Int = _age
}

fun main() {
    val user3 = User(1, "Junyoung", 30)
    println("user3.name = ${user3.name}")
}