package part2

fun main(args: Array<String>) {
    var first = "Hello"
    var second = "World"
    first += second
}

/**
 * 참조타입 : 스택이 아닌 힙 영역에 실제 공간이 할당되는 타입
 * Byte, Short,Int,Long,Float,Double,Char,Boolean 타입을 제외한 타입은 모두 참조타입
 *
 * String은 힙영역에 생성된다
 * String 변수는 문자열의 참조값을 저장하기 위한 공간만 가지고 있다
 *
 * 스택에 first 변수
 *   -first 변수는 힙영역의 "Hello" 주소를 저장하고 있음
 * 스택에 second 변수
 *   -second 변수는 힙영역의 "World" 주소를 저장하고 있음
 *
 * first + second
 *   -새로"HelloWorld" 라는 문자열을 만든 후 그 주소를 바라본다
 *
 * 이후 first, second에 있던 Hello, world 삭제 안됨 => 계속 쌓임, 메모리공간 문제..
 *
 * 참조하는 것들이 없는 미아객체들이 쌓이면... 시스템이 자동으로 "가비지 컬렉션" 을 수행해 필요없는 힙영역의 객체들을 삭제한다
 *
 */


