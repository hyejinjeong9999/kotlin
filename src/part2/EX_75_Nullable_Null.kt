package part2


fun main(args: Array<String>) {
    var person: Person5? = Person5("K", 30)
    person = null // person의 참조변수와 person의 인스턴트의 연결이 끊겼다
    var num: Int? = null
    num = 10 //10은 힙영역에 저장된다
}

/**
 * 타입 이름 뒤에 ? 를 붙이면 변수를 Nullable하게 할 수 있다
 *
 * Byte, Short, Int, Long, Float, Double, Char, Boolean 타입 뒤에 ?를 붙이면 그 변수는 "참조변수" 가 된다
 * 스택영역이 아닌 힙영역에 생성된다
 *
 * 자바와 달리 코틀린은 Nullable타입에서만 null을 지정할 수 있다
 */
