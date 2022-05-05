fun main(args: Array<String>) {
    println(getSumOf(1, 2, 3, 4, 5, 6, 7))
    println(getSumOf(33, 52, 12))
    println(getSumOf())
    println(getSumOfWithName("hi", 1, 2, 3))

}

fun getSumOf(vararg numbers: Int): Int? {

    val count = numbers.size;
    var i = 0
    var sum = 0

    while (i < count) {
        sum += numbers[i]
        i += 1;
    }
    return sum
}

fun getSumOfWithName(name: String, vararg numbers: Int): String {
    val count = numbers.size;
    var i = 0
    var sum = 0

    while (i < count) {
        sum += numbers[i]
        i += 1;
    }
    return "$name ! $sum"
}


/**
 * vararg 여러개의 인수를 받을 수 있게 된다
 * 매개변수의 특정위치의 값을 가져오고 싶으면 문자열처럼 대괄호를 이용하면 된다.
 * 가변인수와 일반인수를 함께 쓸 수 있다
 * 일반인수가 가변인수보다 오른쪽에 있다면 매개변수 이름을 꼭 붙여야 한다
 */