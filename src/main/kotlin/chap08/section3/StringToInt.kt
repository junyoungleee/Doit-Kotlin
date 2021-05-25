package chap08.section3

import java.lang.NumberFormatException

fun main() {
    val num: Int = "123".toInt()

    try {
        "12w".toInt()
    } catch (e: NumberFormatException) {
        println(e.printStackTrace())
        println("12w".toIntOrNull())
    }
}