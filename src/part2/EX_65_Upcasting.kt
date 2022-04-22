package part2


open class AAA2 {
    open fun func() = println("AAA")
}

class BBB : AAA2() {
    //func를 오버라이딩
    override fun func() {
        //슈퍼클래스의 func 호출
        super.func()
        println("BBB")
    }
}


fun main(args: Array<String>) {
    AAA2().func()
    BBB().func()
}

/**
 * 오버라이딩시 Override 키워드를 반드시 붙어야 한다
 * super : 슈퍼클래스의 이름을 나타내는 것
 *
 * 만약 오버라이딩을 막으려면 final 키워드를 사용하면 된
 */