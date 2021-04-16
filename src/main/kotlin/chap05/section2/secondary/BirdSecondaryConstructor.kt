package chap05.section2.secondary

class Bird {
    // 프로퍼티 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 부 생성자1 : 매개변수에 언더스코어 사용
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    // 부 생성자2
    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = print("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue") // 부 생성자 1
    val nana = Bird("bird2", "long") // 부 생성자 2
    coco.color = "blue"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}