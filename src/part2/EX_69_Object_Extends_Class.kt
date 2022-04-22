package part2

open class Person7(val name: String, val age: Int) {
    open fun print() {
        println("이름:$name")
        println("나이:$age")
    }
}

fun main(args: Array<String>) {
    //1회용 상속
    /**
     * Person 클래스를 상속하는 object 표현식이다
     */
    val custom: Person7 = object : Person7("Alan", 23){
        override fun print(){
            println("It's a object")
        }
    }
    custom.print()
}

