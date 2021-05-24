package chap08.section2

fun main() {
    var arr = intArrayOf(1, 2, 3, 4, 5)

    arr.forEach { element -> print("$element") }

    arr.forEachIndexed { i, e -> println("arr[$i] = $e") }

    val iter: Iterator<Int> = arr.iterator()
    while (iter.hasNext()) {
        val e = iter.next()
        print("$e ")
    }
}