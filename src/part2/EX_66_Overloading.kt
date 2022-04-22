package part2


open class Person6(var name: String, val age: Int)

class Student2(name: String, age: Int, val id: Int) : Person6(name, age)

fun main(args: Array<String>) {

    val person: Person6 = Student2("John", 32, 20171218)
}

/**
 * Student 클래스는 Person 클래스의 모든 프로퍼티와 =멤버함수를 포함하기 때문에 가능
 *
 * 슈퍼클래스 타입은 항상 슈퍼클래스 자체나 서브클래스의 인스턴스만 가르킬 수 있다
 */