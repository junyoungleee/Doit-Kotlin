package chap03.section3

fun main() {
    var result: Int
    val multi = {x: Int, y: Int -> x*y}
    val multi2: (Int, Int) -> Int = {x: Int, y: Int ->
        println("x*y")
        x*y // 마지막 식이 반환
    }
    result = multi(10, 20)
    println(result)

    val greet: () -> Unit = {println("Hello World!")}
    // val great = {println("Hello World!"}
    val square: (Int) -> Int = {x -> x*x}
    // val square = {x: Int -> x*x}
    val nestedLambda: () -> () -> Unit = {{println("Hello World!")}}
    // val nestedLambda = {{println("Hello World!")}}
}