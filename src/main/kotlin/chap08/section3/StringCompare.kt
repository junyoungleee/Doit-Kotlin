package chap08.section3

fun main() {
    var s1 = "Hello kotlin"
    var s2 = "Hello KOTLIN"

    println(s1.compareTo(s2))
    println(s1.compareTo(s2, true))
}