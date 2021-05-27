package chap09.section3

fun main() {
    val intsLinkedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(11, 23, 63, 47, 13)
    intsLinkedHashSet.add(3)
    intsLinkedHashSet.remove(11)

    println(intsLinkedHashSet)  // [23, 63, 47, 13, 3]
    intsLinkedHashSet.clear()
    println(intsLinkedHashSet)  // []
}