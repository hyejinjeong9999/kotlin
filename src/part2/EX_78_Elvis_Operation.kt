package part2


fun main(args: Array<String>) {

    val number: Int? = null
    println(number ?: 0) //0 null이니까

    val number2: Int = 15
    println(number2 ?: 0) //15 null이 아니니까
}

/**
 * 엘비스 연산자
 * 원쪽의 피연산자가 null이 아니면 그 값을 그대로 쓰고
 * null이면 우측의 피연산자로 대체한다
 *
 * 자바에서
 * (number != null)?number: :0 과 같은거다
 *
 *
 */
