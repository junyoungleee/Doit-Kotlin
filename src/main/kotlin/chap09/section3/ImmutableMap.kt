package chap09.section3

fun main() {
    val langMap: Map<Int, String> = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")
    for ((key, value) in langMap) {
        println("key = $key, value = $value")
    }

    println("langMap[22] = ${langMap[22]}")  // langMap[22] = Kotlin
    println("langMap.get(22) = ${langMap.get(22)}")  // langMap.get(22) = Kotlin
    println("langMap.keys = ${langMap.keys}")  // langMap.keys = [11, 22, 33]
}