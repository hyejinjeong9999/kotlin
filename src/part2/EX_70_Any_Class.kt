package part2

open class Building2(val name: String = "", val date: String = "", val area: Int = 0) {

    override fun toString() = "이름 : ${this.name}, 건축일자 : ${this.date}, 면젹 : ${this.area}"
}

fun main(args: Array<String>) {

    val building = Building2("코틀린", area = 100)
    printObject(building)
}

fun printObject(any: Any) {
    println(any.toString())
    //함수는 전달한 인수가 String이 아니면 자동으로 any.toString을 호출하기 때문에 println(any)를 사용해도 된다
    print(any)
}

/**
 * 어떤 클래스가 아무클래스도 상속하지 않으면 자동으로 Any 클래스를 상속한다
 * 다른 클래스를 상속한다고 해도 치 상위 클래스가 Any 클래스를 상속한다
 * 그러므로 모든 코틀린 클래스는 Any 클래스를 상속한다
 *
 * Any클래스에는
 * equal , hashCode, toString 멤버함수가 있다
 * 그래서 모든 클래스는 이 기능을 가지고 있다
 */

