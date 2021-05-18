package chap08.section1

class GenericNull<T> {
    fun EqulityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>()  // non-null
    obj.EqulityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>()  // null이 가능한 형식
    obj2.EqulityFunc(null, 10)
}