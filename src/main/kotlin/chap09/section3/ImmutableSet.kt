package chap09.section3

fun main() {
    val mixedTypeSet = setOf("Hello", 5, "world", 3.14, 'c')
    var intSet: Set<Int> = setOf<Int>(1, 2, 3, 3, 4)

    println(mixedTypeSet)  // [Hello, 5, world, 3.14, c]
    println(intSet)  // [1, 2, 3, 4]
}