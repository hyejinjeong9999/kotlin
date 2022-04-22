package part2


class Professor(name: String, age: Int) : Person5(name, age)

fun main(args: Array<String>) {
    val person: Person5 = Student("Mark Zukerberg", 33, 20171225)

    print("${person is Person5}")
    print("${person is Student}")
    print("${person is Professor}")

val person2:Person5 = Professor("Kim",48)
    print("${person2 is Person5}")
    print("${person2 is Student}")
    print("${person2 !is Professor}")


    /**
     * is연산자로 참조변수가 실제로 가리키고 있는 객체의 타입을 확인할 수 있다
     *
     * 자바의 instanceof 와 같은 역할
     *
     * !is 는 아닌것이다
     *
     */

}

