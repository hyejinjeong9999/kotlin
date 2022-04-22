package part2

class AAA {
    var num = 15
    fun memberFunc(num: Int) {
        println(num)
        println(this.num)
    }
}

fun main(args: Array<String>) {
    val a = AAA()
    a.memberFunc(53)
}
/**
 * AAA 클래스 안에는 num이르는 프로퍼티가 있다 = 15
 * memberFunc의 매개변수 이름도 num이다
 *
 * this가 붙은 변수가 프로퍼티로 인식되기 때문에 오류가 발생하지 앟는다
 */

