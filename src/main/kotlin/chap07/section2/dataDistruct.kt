package chap07.section2

fun main() {
    val cus1 = Customer("Jason", "json@mail.com")
    val cus2 = Customer("John", "john@mail.com")
    val cus3 = Customer("Jake", "jake@mail.com")
    val cus4 = Customer("June", "june@mail.com")

    val customers = listOf<Customer>(cus1, cus2, cus3, cus4)
    for ((name, email) in customers) {
        println("name = $name, email = $email")
    }
}