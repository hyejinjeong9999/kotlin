package part2


class Point2(var x: Int = 0, var y: Int = 0) {

    /**
     * 중위표기법을 지원하려면 멤버 함수 선언문 앞에 infix를 적어야 한다
     */
    infix fun from(base: Point2): Point2 {
        return Point2(x - base.x, y - base.y)
    }
}

fun main(args: Array<String>) {
    //중위표기법으로 porint2 from point2 를 계산하고 있다
    val pt = Point2(3, 6) from Point2(1, 1)
    println(pt.x)
    println(pt.y)

}

/**
 * 중위표기법
 * 피연산자 연산자 피연산자 순서로 표현식을 구성하는 방식
 * 멤버 함수의 매개변수가 하나뿐이면 함수 호출을 중위표기법으로 할 수 있다
 */