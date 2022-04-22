package part2


fun main(args: Array<String>) {
    println('o' in "Kotlin")
    println("in" !in "Kotlin")

}

/**
 * in
 *
 * 어떤 값이 객체에 포함되어 있는지 여부를 조사한다
 * "kotlin".contins('o')
 *
 * !in
 *
 * 어떤 값이 객체에 포함되어 있지 않은지 여부를 조사
 * !"kotlin".contins('o')
 */