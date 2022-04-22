package part2

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>) {
    val person: Person
    person = Person()
    person.name = "홍길동"
    person.age = 36

    val person2: Person
    person2 = Person()
    person2.name = "김미영"
    person2.age = 29

    val person3: Person
    person3 = Person()
    person3.name = "Jhon"
    person3.age = 52

}

/**
 * class 클래스명 {
 *  프로퍼티
 * }
 * 를 이용해서 클래스를 선언할 수 있다
 * 코틀린은 자바와 다르게 클래스 이름이 파일 이름과 같을 필요가 없다
 * 한 파일 내에 여러개의 public 클래스를 선언할 수도 있다
 *
 * 객체를 생성할때 사용하는 new 생성자를 쓸 필요 없이 생성자만 호출하면 된다
 *
 * 기본 접근지정자가 default인 자바와 다르게
 * 코틀린은 기본 접근지정자가 public이다
 */