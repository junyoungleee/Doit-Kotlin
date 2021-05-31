package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    println(list.map { it * 2 })  // [2, 4, 6, 8, 10, 12]

    val mapIndexed = list.mapIndexed { index, it -> index * it }
    println(mapIndexed)  // [0, 2, 6, 12, 20, 30]

    println(listWithNull.mapNotNull { it?.times(2) })
    // [2, 6, 10, 12]

    println(list.flatMap { listOf(it, 'A') })  // [1, A, 2, A, 3, A, 4, A, 5, A, 6, A]
    val result = listOf("abc", "12").flatMap { it.toList() }
    println(result)  // [a, b, c, 1, 2]

    val grapMap = list.groupBy { if (it % 2 == 0) "even" else "odd" }
    println(grapMap)  // {odd=[1, 3, 5], even=[2, 4, 6]}
}