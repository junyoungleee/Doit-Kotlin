package chap09.section3

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap
import kotlin.collections.LinkedHashSet

fun main() {
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "Hello", 2 to "World")
    println("hashMap = $hashMap")  // hashMap = {1=Hello, 2=World}

    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap")  // sortedMap = {1=Apple, 2=Banana}

    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer", 2 to "Mouse")
    println("linkedHash = $linkedHash")  // linkedHash = {1=Computer, 2=Mouse}
}