package part2

open class AAA3 {
    open var number = 10
        get() {
            println("AAA number Getter 호출")
            return field
        }
        set(value) {
            println("AAA number Setter 호출")
            field = value
        }
}

class BBB2 : AAA3() {
    override var number: Int
        get() {
            println("BBB number Getter 호출")
            return super.number
        }
        set(value) {
            println("BBB number Setter 호출")
            super.number = value
        }
}

fun main(args: Array<String>) {
    val test = BBB2()
    test.number = 5
    println(test.number)
}

/**
 * 프로퍼티에서 getter / setter 를 이용해 오버라이딩이 가능하다
 */