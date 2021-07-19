package chap10.section1

fun inc(x: Int): Int {
    return x+1
}

fun high(name: String, body: (Int)->Int): Int {
    println("name: $name")
    val x = 0
    return body(x)
}

fun main() {
    val result1 = high("June", { x -> inc(x + 3) })
    val result2 = high("June") { inc(it + 3) }
    val result3 = high("June", ::inc)
    val result4 = high("June") { x -> x + 3 }
    val result5 = high("June") { it + 3 }

    println(result1)
}