package chap08.section1

fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}

fun main() {
    val result = add(2, 3, {a, b -> a+b})
    println(result)

    var sumInt: (Int, Int) -> Int = {a, b -> a+b}
    var sumInt2 = {a: Int, b: Int -> a+b}
    println(add(2, 3, sumInt))
    println(add(2, 3, sumInt2))
}