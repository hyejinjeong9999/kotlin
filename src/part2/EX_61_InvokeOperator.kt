package part2


class Product2(var id:Int, val name:String) {

    /**
     * () 는 함수를 호출할 때 사용하는 연산자다 -> 오버로딩 가능
     *
     * () 연산자를 오버로딩하는 멤버 함수 invoke
     */
    operator fun invoke(value: Int){
        println(value)
        println("id:$id\nname:$name")
    }

}


    fun main(args: Array<String>) {

        val product = Product2(762443,"코틀린200제")

        /**
         * product(108)은 컴파일시 product.invoke(108)로 번역된다
         * 그래서 invoke 함수가 호출된다
         */
        product(108)

    }

/**
 * 여러개의 피연산자를 지정할 수 있다
 * person[1,2,3] => person.get(1,2,3)
 * person[1,2] = "J" => pserson.set(1,2,"J)
 */
