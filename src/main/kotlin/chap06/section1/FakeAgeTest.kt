package chap06.section1

fun main() {
    val lee = FakeAge()
    lee.age = 15
    println("Lee's real age = 15, pretended age = ${lee.age}")

    val paek = FakeAge()
    paek.age = 49
    println("Paek's real age = 49, pretended age = ${paek.age}")
}

class FakeAge {
    var age: Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}