package part2

class Size (width: Int, height: Int) {
    val width = width
    val height:Int

    init {
        this.height = height
    }

    val area: Int

    init {
        area = width * height
    }
}

fun main(args: Array<String>) {
    val size = Size(10,50)
    println(size.area)
}
/**
 * 생성자의 매개변수로 프로퍼티를 선언과 동시에 초기화 할 수도 있다
 * height의 경우 init에서 초기화하고 있다
 * area의 경우 width와 height의 곱으로 초기화 하고 있다
 *
 */

