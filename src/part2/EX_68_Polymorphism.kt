package part2

open class AAA4 {
    open fun hello() = println("AAA입니다")
}

class BBB3 : AAA4() {
    override fun hello() = println("BBB입니다")
}

fun main(args: Array<String>) {
    val one = AAA4()
    val two = BBB3()
    val three: AAA4 = two

    one.hello()
    two.hello()
    three.hello()

}

/**
 * three는 AAA 타입이지만 가르키는건 two(BBB)기 때문에 BBB입니다가 호출된다
 * -> 다형성
 */