fun main(args: Array<String>) {
    val a = -36
    val result = absolute(a)
    println(result)
}

fun absolute(number: Int): Int {
    return if (number >= 0)
        number
    else -number
}
/**
 * main 함수 시작
 * 스택영역
 *
 * 지역변수 a
 * stack영역
 *
 * absoulte 실행
 * 매개변수 number stack에 생성
성*/
