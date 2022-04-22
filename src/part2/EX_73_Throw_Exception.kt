package part2


fun main(args: Array<String>) {

    try {
        somthing()

    } catch (e: Exception) {
        println(e.message)
    }
}

    fun somthing() {
        val num1 = 10
        val num2 = 0
        div(num1, num2)
    }

    fun div(a: Int, b: Int):Int {
        if (b == 0)
            throw Exception("0으로 나눌 수 없습니다")
        return a / b
    }


/**
 * 고의로 예외를 발생시킬 수 있다
 * 코틀린에는 throws 키워드가 없다
 * 자바는 throws가 있는 함수를 호출할때마다 try-catch블록으로 감싸야 하지만
 * 코틀린은 throws 키워드를 제거함
 * 코틀린에서 예외처리는 옵션임
 */