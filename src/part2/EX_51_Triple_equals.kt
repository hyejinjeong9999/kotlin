package part2

fun main(args: Array<String>) {

    var a = "one"
    var b = "one"

    println(a === b)
    //둘은 heap에 같은 바라보기 때문에 true

    b = "on"
    b += "e"
    println(a !== b)
    //on + e 라는 새로운 문자열을 만들기 때문에 a와 b는 다른 객체를 바라봄 true

    b = a
    println(a === b)

    //b가 a와 같은 객체를 바라봄 true
}

/**
 * === 두 참조 변수가 같은 객체를 바라보고 있는지 여부를 조사하는 연산자
 * 참조변수1 === 참조변수2 -> 두 참조변수가 같은 객체를 바라보면 true
 * 참조변수1 !== 참조변수2 -> 두 참조변수가 다른 객체를 바라보면 ture
 */


