package chap09.section2

fun main() {
    val mutableList: MutableList<String> = mutableListOf<String>("Apple", "Banana", "Carrot")
    mutableList.add("Dorazi")
    mutableList.removeAt(1)
    mutableList[0] = "Bori"
    println(mutableList)  // [Bori, Carrot, Dorazi]

    val mutableListMixed = mutableListOf("Android", "iOS", 1, 25, 'X')
    println(mutableListMixed)  // [Android, iOS, 1, 25, X]
}