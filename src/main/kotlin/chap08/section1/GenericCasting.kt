package chap08.section1

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
//    val obj1: Parent = Child()  // Parent 형식은 Child 자료형으로 변환될 수 있음
//    val obj2: Child = Parent()  // 반대로 변환할 수는 없음
//
//    // 자료형 불일치
//    val obj3: Cup<Parent> = Cup<Child>()
//    val obj4: Cup<Child> = Cup<Parent>()

    // 자료형 일치
    val obj5 = Cup<Child>()
    val obj6: Cup<Child> = obj5
}