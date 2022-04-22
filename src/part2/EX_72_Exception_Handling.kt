package part2


fun main(args: Array<String>) {
    try {

        val str = "abcd"
        val num = str.toInt()
        print(num)

    } catch (e: NumberFormatException) {

        println("문자열은 숫자로 변경하지 못함")

    } finally {
        println("프로그램 종료")
    }

}

/**
 * try 블록을 수행하고 예외가 발생했을때 대신 실행할 코드를 catch에 넣는다
 * finlly : 발생 여부와 상관없이 무조건 실행되는 구문
 */