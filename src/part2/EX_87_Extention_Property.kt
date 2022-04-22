package part2


/**
 * 프로퍼티도 확장이 가능하다
 */
val String.isLarge: Boolean
    /**
     * 문자열 길이가 10 이상이면 true
     */
    get() = this.length >= 10


fun main(args: Array<String>) {
    println("1234567890".isLarge)
    println("500원".isLarge)

}
