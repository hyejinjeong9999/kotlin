fun main(Args: Array<String>): Unit {
    println(myFunction())
    println(myFunction() + 10)
    println(oneLineFun())
    println(shotterFun())
}

fun myFunction(): Int {
    val a = 3
    val b = 6
    println("a: $a b: $b")
    return a + b;
}

//길이 문장이 하나면 줄여쓸 수 있다
fun oneLineFun(): Double = 3.0 + 7
//타입 추론이 가능하면 리턴값 생략 가능
fun shotterFun() = 3.0 + 7

/**
 * fun 식별자(): 반환타입
 * {
 *  함수에서 실행할 내용
 * }
 */