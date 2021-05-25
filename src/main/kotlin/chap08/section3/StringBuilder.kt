package chap08.section3

fun main() {
    var s = StringBuilder("Hello")
    s[2] = 'x'

    println(s.append("World"))
    println(s.insert(10, "Added"))
    println(s.delete(5, 10))
}