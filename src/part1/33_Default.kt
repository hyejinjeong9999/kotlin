fun main(args: Array<String>) {
    println(getAverage2(89, 96))
    getAverage2(100, 50, true)
    println(getAverage2(90))
    getAverage2(66, print = true)
    getAverage2(print = true)
    getAverage2(print = true, a = 10, b = 30)
}


fun getAverage2(a: Int = 0, b: Int = 0, print: Boolean = false): Double {
    val result = (a + b) / 2.0
    if (print)
        println(result)
    return result
}

/**
 * 매개변수에 default 값을 지정할 수 있다
 * 인수가 지정되지 않은 매개변수는 디폴트 값으로 초기화된다
 * 매개변수 이름을 직접 지정할땐 일반 인수들보다 오른쪽에 있어야 한다
 *
 */