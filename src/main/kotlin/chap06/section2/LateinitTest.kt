package chap06.section2

class Person {
    lateinit var name: String
    fun test() {
        if(!::name.isInitialized) {
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val jun = Person()
    jun.test()
    jun.name = "Junyoung"
    jun.test()
    println("name = ${jun.name}")
}