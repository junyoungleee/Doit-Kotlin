package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    println(list.filter { it % 2 == 0 })  // [2, 4, 6]
    println(list.filterNot { it % 2 == 0 })  // [1, 3, 5]
    println(listWithNull.filterNotNull())  // [1, 3, 5, 6]

    println("filterIndexed: "+list.filterIndexed { index, value -> index != 1 && value % 2 == 0 })
    // filterIndexed: [4, 6]

    val mutList = list.filterIndexedTo(mutableListOf()) { index, value -> index != 1 && value % 2 == 0 }
    println("filterIndexedTo: $mutList")
    // filterIndexedTo: [4, 6]

    println("filterKeys: " + map.filterKeys { it != 11 })  // filterKeys: {22=Kotlin, 33=C++}
    println("filterValues: " + map.filterValues { it == "Java" })  // filterValues: {11=Java}

    println("filterIsInstance: " + listMixed.filterIsInstance<String>())  // filterIsInstance: [Hello, World]

    println("slice: " + list.slice(listOf(0, 1, 2)))  // slice: [1, 2, 3]

    println(list.take(2))  // [1, 2]
    println(list.takeLast(2))  // [5, 6]
    println(list.takeWhile { it < 3 })  // [1, 2]

    println(list.drop(3))  // [4, 5, 6]
    println(list.dropWhile { it < 3 })  // [3, 4, 5, 6]
    println(list.dropLastWhile { it > 3 })  // [1, 2, 3]

    println("component1(): " + list.component1())  // component1(): 1

    println("distinct: " + listRepeated.distinct())  // distinct: [2, 3, 4, 5, 6]

    println("intersect: " + list.intersect(listOf(5, 6, 7, 8)))  // intersect: [5, 6]
}