package chap09.section3

fun main() {
    val capitalCityMap: MutableMap<String, String>
            = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values)  // [Seoul, Beijing, Tokyo]
    println(capitalCityMap.keys)  // [Korea, China, Japan]

    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")
    println(capitalCityMap)  // {Korea=Seoul, Japan=Tokyo, UK=London}

    val addData = mutableMapOf("USA" to "Washington")
    capitalCityMap.putAll(addData)
    println(capitalCityMap)  // {Korea=Seoul, Japan=Tokyo, UK=London, USA=Washington}
}