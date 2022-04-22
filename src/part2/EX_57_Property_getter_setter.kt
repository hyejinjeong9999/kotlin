package part2

class Person3 {
    var age: Int = 0
        get() {
            return field
        }
        set(value) {
            field = if (value >= 0) value else 0
        }

    //디폴트 getter setter 정의
//    var age = 0
//    get
//    set

    //getter 속 문장이 하나일 때
//    var name = ""
//    get() = "이름:$field"

//    getter 반환값이 field가 아닐 때
//    var age = 0
//    var isYoungGet() = age<30

}


fun main(args: Array<String>) {
    var person = Person3()
    person.age = -30
    println(person.age)
}


/**
 * 프로퍼티는 필드, getter, setter 로 이루어져 있다
 * filed : 데이터가 저장되는 공간
 * getter : 저장 된 값을 읽는 함수
 * setter : 저장할 때 호출되는 함수
 * (val 변수는 steer가 없다)
 *
 * getter와 setter를 별도로 지정하지 않으면 디폴트 getter와 setter가 자동으로 정의된다
 */