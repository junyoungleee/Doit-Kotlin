package chap09.section5

fun main() {
    val nums: Sequence<Int> = generateSequence(1) { it + 1 }

    println(nums.take(10).toList())
    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    val squares = generateSequence(1) { it + 1 }.map {it*it}
    println(squares.take(10).toList())
    // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

    val oddSquares = squares.filter { it % 2 != 0 }
    println(oddSquares.take(5).toList())
    // [1, 9, 25, 49, 81]
}