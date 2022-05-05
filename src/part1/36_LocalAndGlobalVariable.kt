//count스코프
var count = 0;

fun main(args: Array<String>) {
//a의 스코프
    val a = 15
    println(a)

    count += 1
    printCount()
    println(count)
//a 스코프 끝
}

fun printCount() {
    println(count)
    count += 1
}
/**
 *
 */
