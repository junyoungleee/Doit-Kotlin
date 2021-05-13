package chap07.section4

class Manager {
    operator fun invoke(value: String) {
        println(value)
    }
}

fun main() {
    val manager = Manager()
    manager("Do something for me!")

    val sum = {x: Int, y: Int -> x+y}
    val result1 = sum.invoke(3, 10)
    val result2 = sum(3, 10)
    println("${result1}, ${result2}")
}