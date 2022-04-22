package part2


private var num = 10 //이 파일 내에서만 접근 가능
private fun print() = println(num) //Test.kt 파일 내에서만 접근 가능

//어디서나 접근 가능
public fun hello(value: Int) {
    num = value
    print()
}

//어디서나 접근 가능
public class Person8(age: Int) {
    //디폴트 Setter를 private로 지정 Setter는 Pseson 클래스 내부에서만 사용 가능하다
    public var age = age
        private set

    public val isYoung public get() = age < 30
}

fun main(args: Array<String>) {
    num = 5
    hello(15)
    val person = Person8(10)
    println(person.age)
//    person.age = 20

    println(person.isYoung)
}