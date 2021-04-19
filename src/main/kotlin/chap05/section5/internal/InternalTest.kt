package chap05.section5.internal

internal class InternalClass {
    internal var i = 1
    internal fun icFunc() {
        i += 1
    }
    fun access() {
        icFunc()
    }
}

class OtherClass {
    internal val ic = InternalClass()
    fun test() {
        ic.i
        ic.icFunc()
    }
}

fun main() {
    val mic = InternalClass()
    mic.i
    mic.icFunc()
}