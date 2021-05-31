package chap09.section4

fun main() {
    val unsortedList = listOf(3, 2, 7, 5)
    println(unsortedList.reversed())  // [5, 7, 2, 3]

    println(unsortedList.sorted())  // [2, 3, 5, 7]

    println(unsortedList.sortedDescending())  // [7, 5, 3, 2]

    println(unsortedList.sortedBy { it % 3 })  // [3, 7, 2, 5]
    println(unsortedList.sortedByDescending { it % 3 })  // [2, 5, 7, 3]
}