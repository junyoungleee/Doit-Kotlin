package chap07.section1

interface Pet {
    var category: String  // 추상 프로퍼티
    val msgTags: String
        get() = "I'm your lovely pet!"

    var species: String
    fun feeding()    // 추상 메서드
    fun patting() {  // 일반 메서드
        println("Keep patting!")
    }
}

class Cat(name: String, override var category: String) : Pet {
    override var species: String = "cat"
    override fun feeding() {
        println("Feed the cate a tuna can!")
    }
}

fun main() {
    val obj = Cat("Coco", "small")
    println("Pet Category: ${obj.category}")
    println("Pet MsgTags: ${obj.msgTags}")
    obj.feeding()
    obj.patting()
}