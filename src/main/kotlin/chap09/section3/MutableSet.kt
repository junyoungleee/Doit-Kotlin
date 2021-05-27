package chap09.section3

fun main() {
    val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals)  // [Lion, Dog, Cat, Python, Hippo]

    animals.add("Dog")
    println(animals)  // [Lion, Dog, Cat, Python, Hippo]

    animals.remove("Python")
    println(animals)  // [Lion, Dog, Cat, Hippo]
}