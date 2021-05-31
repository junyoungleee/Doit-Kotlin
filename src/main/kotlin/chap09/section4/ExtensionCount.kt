package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    list.forEach { print("$it") }
    println()
    list.forEachIndexed { index, value -> println("index[$index]: $value") }

    val returnedList = list.onEach { print(it)}
    println()
    val returnedMap = map.onEach { println("key: ${it.key}, value: ${it.value}") }
    println("returnedList = $returnedList")  // returnedList = [1, 2, 3, 4, 5, 6]
    println("returnedMap = $returnedMap")  // returnedMap = {11=Java, 22=Kotlin, 33=C++}

    println(list.count { it % 2 == 0})  // 3
    println(list.count())  // 6

    println(list.max())  // 6
    println(list.min())  // 1

    println("maxBy: "+map.maxBy { it.key })  // maxBy: 33=C++
    println("minBy: "+map.minBy { it.key })  // minBy: 11=Java

    println(list.fold(4) { total, next -> total + next })  // 4 + 1 + ... + 6 = 25
    println(list.fold(1) { total, next -> total * next })  // 1 * 1 * ... * 6 = 720

    println(list.foldRight(4) { total, next -> total + next })  // 25
    println(list.foldRight(1) { total, next -> total * next })  // 720

    println(list.reduce { total, next -> total + next })  // 21
    println(list.reduceRight { total, next -> total + next })  // 21

    println(listPair.sumBy { it.second })  // 600
}