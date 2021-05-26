package chap09.section2

fun main() {
    val names: List<String> = listOf("one", "two", "three")  // 불변형
    val mutableName = names.toMutableList()  // 새로운 가변형
    mutableName.add("four")
    println(mutableName)  // [one, two, three, four]
}