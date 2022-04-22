package part2

fun throwing():Nothing = throw Exception()
fun main(args: Array<String>) {
    println("start")
    val i:Int = throwing()
    println(i)
}

/**
 * Exception이 나면 반환하는 값이 없기때문에 Unit이 된다
 * Nothing 타입을 throw를 표현식으로 쓸 수 있게 한다
 */
fun validation(num:Int){
    val result:Int =
        if(num >= 0 )num
    else throw Exception("num이 음수입니다")
}



/**
 * Nothing 타입은 실행 흐름이 도달할 수 없는 구역을 나타내기 위한 특수타입이다
 * throw Exception() 표현식은 Nothing 타입을 갖게 된다
 */