package part2


fun main(args: Array<String>) {

    var obj: Building? = Building()
    obj!!.name = "서울시청"
    println(obj!!.name)

    obj = null
//    obj!!.print()
}

/**
 * !! 연산자는 Nullable 타입을 Not null 타입으로 강제로 캐스팅한다
 *
 */
