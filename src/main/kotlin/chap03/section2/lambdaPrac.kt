package chap03.section2

fun main() {
    println(highFunc({x, y -> x+y}, 10, 20))
}

fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b)