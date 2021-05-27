package chap09.section3

import java.util.*

fun main() {
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 6, 3)
    intsSortedSet.add(7)
    intsSortedSet.remove(1)
    println("intsSortedSet = ${intsSortedSet}")  // intsSortedSet = [3, 4, 6, 7]

    intsSortedSet.clear()
    println("intsSortedSet = ${intsSortedSet}")  // intsSortedSet = []
}