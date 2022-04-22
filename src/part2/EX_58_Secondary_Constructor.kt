package part2

//초 값을 저장하는 val second:Int 프로퍼티를 선언 및 초기화
class Time(val second: Int) {
    init {
        println("this is init")
    }

    //this(인수) : 이 클래스에 포함된 또다른 생성자 호출 (인수 하나니까 주생성자 호출됨)
    constructor(minute: Int, second: Int) : this(minute * 60 + second) {
        println("this is secondary constructor")
    }

    //인수가 두개인 보조생성자1 호출함
    constructor(hour: Int, minute: Int, second: Int) : this(hour * 60 + minute , 60 + second) {
        println("this is secondary constructor2")
    }

    //주생성자 -> init -> 보조생성자 순으로 호출된다
    init{
        println("aonther init block")
    }

}


fun main(args: Array<String>) {
    println("${Time(15,6).second} 초")
    println("${Time(6,3,17).second} 초")
}

/**
 * 보조생성자에서는 주생성자를 반드시 먼저 호출해야 한다
 */