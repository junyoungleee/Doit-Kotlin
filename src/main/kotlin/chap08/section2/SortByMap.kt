package chap08.section2

fun main() {
    val fruits = arrayOf("Banana", "Avocado", "Apple", "Kiwi")
    fruits.filter { it.startsWith("A") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { print(it + " ") }

}