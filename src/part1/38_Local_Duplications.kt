fun main() {
//지역변수 a
    val a = 52
    println(a)

    printA()
    printA2()
}

fun printA() {
    val a = 17
    println(a)
}

fun printA2() {
    val a = 120
    println(a)
}

/**
 * 지역변수간에는 스코프가 겹치지 않기 때문에 함수간 변수의 이름이 같아도 문제 없다
 */
