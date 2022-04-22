package part2


fun main(args: Array<String>) {

    var obj: Building? = null
    //null이기 때문에 print 호출 무시된다
    obj?.print()
    //null이기 때문에 프로퍼티에값을 지정하는 동작이 무시된다
    obj?.name = "건물"

    obj = Building()
    obj?.name = "서울월드컵경기장"
    obj?.date = "2001년 11월 10일"
    obj?.area = 21_6712
    obj?.print()
}

/**
 * Nullable한 참조 변수의프로퍼티와 멤버 함수에 접근하려면 .대신 ?. 연산자를 사용해야 한다
 * 참조변수?.프로퍼티
 * 참조변수가 null이면 표현식이 null값을 갖게 된다
 *
 * 멤버함수의 경우
 * 참조변수?.멤버함수()
 *
 */
