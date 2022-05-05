fun main(Args: Array<String>): Unit {
    val num: Int = 15 - 4 * 3
    val num2: Int = 65 % 7
    val num3: Double = 7.5 / 5 + 22.25
    val num4: Double = num / num2 + 0.7
    val num5: Double = 15.toDouble() + num2
//    val num5: Double = 15.0 + num2


    println(num)
    println(num2)
    println(num3)
    println(num4)
    println(num5)

}

/**
 * 코틀린은 사칙연산법칙을 따른다
 * 실수는 Double
 * 정수는 Int
 *
 * Double 타입에 Int 타입을 저장할 수 없다
 */