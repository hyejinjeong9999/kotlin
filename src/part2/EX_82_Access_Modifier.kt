package part2


class Rectangle(private val width: Int, private val height: Int) {
    val area: Int
        get() = width * height
}

fun main(args: Array<String>) {
    val rec = Rectangle(5,7)
//    println(rec.width) 에러
    println(rec.area)
    /**
     * area는 public이기 때문에 접근 가능
     * width는 private기 때문에 접근 불가능
     */
}

/**
 * public :모든 곳에서 접근 가능 default가 pubilc이다
 *
 * internal : 같은 모듈 안에서 접근 가능하다
 *
 * protected : 클래스 내부와 서브 클래스 안에서만 접근 가능
 *
 * private : 해당 클래스 안에서만 접근 가능
 *
 */


