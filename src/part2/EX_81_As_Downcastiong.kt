package part2


fun main(args: Array<String>) {

    val person: Person6 = Student2("Jhon", 32, 20171218)
    val person2: Person6 = Person6("Jack", 32)

    //왼쪽피연산자를 오른쪽 피연산자로 캐스팅
    //person을 Student로 캐스팅이 가능하다
    var person3: Student2? = person as Student2

    //person을 Student 타입으로 캐스팅하려고 한다
    //Person타입이기 때문에 캐스팅 실패
//    person3 = person2 as Student2

    //캐스팅 실패를 막으려면 as? 연산자를 사용해야 한다
    //대산 Student? 타입이여야 한다
    //캐스팅 실패하면 null을 반환한다
    person3 = person2 as? Student2


    /**
     * 다운캐스팅
     * 업캐스팅과 반대로 슈퍼클래스 타입을 서브클래스 타입으로 받는것
     * as
     *
     */

}

