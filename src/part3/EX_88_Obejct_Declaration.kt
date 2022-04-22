package part3

object Person {
    var name: String = ""
    var age: Int = 0
    fun print() {
        println(name)
        println(age)
    }
}

fun main(args: Array<String>) {

    //식별자 Person으로 객체에 바로 접근
    Person.name = "Stingleton"
    Person.age = 45
    Person.print()
}

/**
 * 클래스를 선언하듯이 객체를 선언한다
 * Person이라는 식별자로 바로 객체에 접근이 가능하다
 *
 * 싱글톤 패턴 코드를 더이상 작성하지 않아도 된다.
 */