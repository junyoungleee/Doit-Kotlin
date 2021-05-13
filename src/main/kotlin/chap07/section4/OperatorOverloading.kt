package chap07.section4

class Point(var x: Int = 0, var y: Int = 10) {
    operator fun plus(p: Point) : Point {
        return Point(x+p.x, y+p.y)
    }
    operator fun dec() = Point(--x, --y)
    operator fun unaryMinus() = Point(-x, -y)
}

data class Point2(val x: Int, val y: Int)

fun main() {

    operator fun Point2.unaryMinus() = Point2(-x, -y)

    val point2 = Point2(10, 20)
    println(-point2)

    -point2
    println("point2 = (${point2.x}, ${point2.y})")
    println("-point2 = (${-point2.x}, ${-point2.y})")
}