package chap07.section2

data class Customer(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String): this(name, email) {
        job = _job
    }
    init {

    }
}

fun main() {
    val cus1 = Customer("J", "jun@mail.com")
    val cus2 = Customer("J", "jun@mail.com")

    println(cus1 == cus2) // 연산자 == 은 내부적으로 equals()을 호출하는 것과 같음
    println(cus1.equals(cus2))
    println("${cus1.hashCode()}, ${cus2.hashCode()}")

    val cus3 = cus1.copy(name = "Alice")
    println(cus1.toString())
    println(cus3.toString())

}