package part2


fun main(args: Array<String>) {
    var str = "abcd"
    var num = str.toInt()

    println(num)

}

/**
 * 변수 str에 문자열 abce를 대입한 후 Int타입으로 변환하려고 함
 * 예외가 발생하면서 프로그램이 강제종료된다
 */