//전역변수 a
var a = 5

fun main() {
//지역변수 a
    val a = 30
    println(a)
    func()
    println(count)
}

fun func() {
    println(a)
}
/**
 * 변수가 중복될때
 * 가장 가까운 스코프의 변수 ->main 이 우선적으로 인식된다
 */
