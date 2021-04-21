package chap07.section1.coffeeMaker

interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}