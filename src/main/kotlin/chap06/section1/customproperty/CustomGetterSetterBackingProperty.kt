package chap06.section1.customproperty

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main() {
    val user2 = User(1, "Junyoung", 23)
    user2.name = ""
    println("user2.name = ${user2.name}")
}