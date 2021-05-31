package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    println("elementA: " + list.elementAt(1))  // elementA: 2

    println("elementAtOrElse: " + list.elementAtOrElse(10, { 2 * it }))  // elementAtOrElse: 20
    println("elementAtOrNull: " + list.elementAtOrNull(10))  // elementAtOrNull: null

    println("first: " + listPair.first { it.second == 200 })  // first: (B, 200)
    println("last: " + listPair.last { it.second == 200 })  // last: (D, 200)
    println("firstOrNull: " + listPair.firstOrNull { it.first == "E" })  // firstOrNull: null
    println("lastOrNull: " + listPair.lastOrNull { it.first == "E" })  // lastOrNull: null

    println("indexOf: " + list.indexOf(4))  // indexOf: 3
    println("indexOfFirst: " + list.indexOfFirst { it % 2 == 0 })  // indexOfFirst: 1
    println("lastIndexOf: " + listRepeated.lastIndexOf(5))  // lastIndexOf: 5
    println("indexOfLast: " + list.indexOfLast { it % 2 == 0 })  // indexOfLast: 5

    println("single: " + listPair.single { it.second == 100 })  // single: (C, 100)
    println("singleOrNull: " + listPair.singleOrNull { it.second == 500 })  // singleOrNull: null

    println("binarySearch: " + list.binarySearch(3))  // binarySearch: 2
    println("find: " + list.find { it > 3 })  // find: 4
}