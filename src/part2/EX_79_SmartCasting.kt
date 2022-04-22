package part2


fun main(args: Array<String>) {
    val number: Int? = null
    val number2 = 1225

    checkNull(number)
    checkNull(number2)
}

fun checkNull(any: Any?) {
    if (any == null) {
        println("null임")
        return
    }

    /**
     * null체크까지 지난 후 여기까지 왔다 => null이 절대 아니다
     * 그래서 any?.toString이 아니라 any.toString을 해도 되는 것
     */
    println(any.toString())
}
