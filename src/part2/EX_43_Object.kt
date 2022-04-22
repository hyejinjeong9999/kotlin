package part2

fun main(args: Array<String>) {
    val person = object {
        val name: String = "홍길동"
        val age: Int = 36
    }

    println(person.name)
    println(person.age)
}

/**
 * person 변수에 object(객체) 타입을 할당하고 초기화했다.
 * 객체에 포함된 변수들을 "프로퍼티" 라고 한다
 * 프로퍼티는 반드시 선언과 동시에 초기화해야한다.
 *
 * 자바의 필드와 유의할것
 * 프로퍼티는 필드 + getter + setter 가 합쳐진 개념이다
 */