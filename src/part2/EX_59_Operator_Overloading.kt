package part2

class Point(var x: Int = 0, var y: Int = 0) {

    /**
     * operator
     * Point의 연산자간에 사용했을때 대신 이걸 호출하라는 의미
     *
     * pt1 + pt2 = pt1.plus(pt2)
     */
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(number: Int): Point {
        return Point(x * number, y * number)
    }

    operator fun div(number: Int): Point {
        return Point(x / number, y / number)
    }

    fun print() {
        println("X:$x,y:$y")
    }

}


fun main(args: Array<String>) {

    val pt1 = Point(3, 7)
    val pt2 = Point(2, -6)

    val pt3 = pt1 + pt2
    val pt4 = pt3 * 6
    val pt5 = pt4 / 3

    pt3.print()
    pt4.print()
    pt5.print()

}

/**
 *오버로딩이 가능한 연산자
 *
 * [단항]
 * +a = a.unaryPlus()
 * -a = a.unaryMinus()
 * !a = a.not()
 *
 * [이항]
 * a+b = a.plus(b)
 * a-b = a.minus(b)
 * a*b = a.times(b)
 * a/b = a.div(b)
 * a%b = a.rem(b)
 * a+=b = a.plusAssign(b)
 * a-=b = a.minusAssign(b)
 * a*=b = a.timesAssign(b)
 * a/=b = a.divAssign(b)
 * a%=b = a.remAssign(b)
 * a>b = a.compareTo(b) >0
 * a==b a?.equals(b)?:(b===null)
 * a!=b !(a?.equals(b)?(b===null))
 */