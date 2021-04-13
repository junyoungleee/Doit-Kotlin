package chap03.section3

fun main() {
    // 매개변수 없는 람다식
    noParam({"Hello World!"})
    noParam {"Hello World!"} // 소괄호 생략 가능

    // 매개변수가 1개 있는 람다식
    oneParam({ a -> "Hello World! $a"})
    oneParam { a -> "Hello World! $a"}
    oneParam { "Hello World! $it"}

    // 매개변수가 2개 있는 람다식
    moreParam { a, b -> "Hello World! $a $b" }
    moreParam { _, b -> "Hello World! $b" }

    // 인자와 함께 람다식을 사용하는 경우
    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b" })
    // withArgs() 함수의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b" }

    // 2개의 람다식을 매개변수로 사용하는 경우
    twoLambda({ a, b -> "First $a $b"}, { "Second $it" })
    twoLambda({ a, b -> "First $a $b"}) { "Second $it" }
}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}