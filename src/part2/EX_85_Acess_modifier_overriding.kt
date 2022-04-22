package part2


/**
 * open을 이용하면 오버라이딩이 가능하다
 */
open class AAA6(protected open val number: Int) {
    protected open fun hello() {
        println("hello")
    }
}

/**
 * 오버라이딩 하면서 protected였던 함수, 프로퍼티를 public으로 변경
 */
class BBB5(number: Int) : AAA6(number) {

    public override val number: Int
        get() = super.number

    public override fun hello() = super.hello()
}

fun main(args: Array<String>) {

    val b = BBB5(26)
    val a: AAA6 = b

//    println(a.number)
//    a.hello
    println(b.number)
    b.hello()

}

/**
 * protected에서 open을 이용하번 오버라이딩이 가능하지만
 *private에는 open을 지정할 수 없다 (서브클래스에서 접근자체가 불가능)
 *
 */