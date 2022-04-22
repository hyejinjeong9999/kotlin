package part2


open class Person5(var name: String, val age: Int)

class Student(name: String, age: Int, val id: Int) : Person5(name, age)

fun main(args: Array<String>) {
    val person = Person5("홍길동", 35)
    val student = Student("김길동", 23, 20171217)
}

/**
 * 코틀린은 자바와 달리 클래스 선언이 기본적으로 final로 되어있다
 * 상속을 허용하려면 open 키워드를 붙여야 한
 * 슈퍼클래스 : 상속의 대상이 되는 클래스 -> person
 * 서브클래스 : 상속하여 확장된 클래스 -> student
 *
 * class 클래스명 : 슈퍼클래스생성자
 *
 * 상속은 하나의 클래스만 가능하다
 */