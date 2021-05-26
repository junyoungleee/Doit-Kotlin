package chap09.section2

import java.util.*

fun main() {
    val stringList: ArrayList<String> = arrayListOf<String>("Hi", "Hello", "Bye")
    stringList.add("Java")
    stringList.remove("Hello")
    println(stringList)  // [Hi, Bye, Java]
}