package part2


open class AAA5(protected val number: Int)

/**
 * protedted는 서브클래스 안에서 접근 가능하다
 */
class BBB4(number: Int) : AAA5(number) {

    fun printNumber() {
        println(number)
    }
}

fun main(args: Array<String>) {

    val test = BBB4(36)
    //에러
    /**
     * protected기 때문에 접근이 불가능하다
     */
//    println(test.number)
    test.printNumber()
}

/**
 * protected는 서브클래스에서 접근 가능한 private라고 생각하면 된다
 */