package part2

class Person2 constructor(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }
}

fun main(args: Array<String>) {
    val person = Person2("홍길동",46)
    println("이름 : ${person.name}")
    println("나이 : ${person.age}")
}
/**
 * 생성자 만드는법
 *
 * class 클래스명 constructor(생성자 매개변수)
 * class 클래스명 (생성자 매개변수)
 *
 * init 블록에서 초기화를 한다
 */

