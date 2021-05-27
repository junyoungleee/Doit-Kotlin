package chap09.section3

fun main() {
    val intsHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 1)
    intsHashSet.add(5)
    intsHashSet.remove(1)
    println(intsHashSet)  // [3, 4, 5, 6]
}