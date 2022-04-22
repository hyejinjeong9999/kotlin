package part2

fun main(args:Array<String>){
    val person = object {
        val name:String = "홍길동"
        val age:Int = 36
    }

    println(person.name)
    println(person.age)
}

/**
 * 1. person 변수를 선언과 동시에 객체로 초기화 한다
 *  ->스택에 person변수가 쌓인다
 * 2. object {...} 부분이 실행된다
 *  ->힙 영역에 객체가 생긴다 // 힙영역은 임의의 위치에 객체가 생성된다 (차곡차곡쌓이는거 아님)
 * 3.person에는 객체의 좌표값을 저장한다
 *  ->객체의 좌표만 저장하는 변수를 "참조변수" 라고한다
 */