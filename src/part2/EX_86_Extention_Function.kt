package part2


/**
 * 함수 이름 앞에 함수를 주입할 클래스를 붙여주면 된다
 * String.[붙일 함수]
 * 함수를 주입할 클래스를 리시버 타입이라고 한다
 */
fun String.isNumber(): Boolean {
    var i = 0
    while (i < this.length) {
        /**
         * 유니코트로 0~9 순서대로 정의되어 있기 때문에
         * 범위 내에 있으면 숫자, 없으면 문자라고 판별했다
         */
        if (!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }
    return true
}


fun main(args: Array<String>) {
    println("1234567890".isNumber())
    println("500원".isNumber())

}
