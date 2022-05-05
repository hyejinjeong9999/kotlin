fun main(args: Array<String>): Unit {
    println(cToF2(30))
}


fun cToF2(celsius: Int): Unit {
    println(celsius * 1.8 + 32)
}

/**
 * return 타입이 필요없을 경우는 Unit이라고 명명하면 된다
 *
 * 자바의 void 는 반환값이 없음을 의미한다
 * Unit은 calss로 정의된 일반타입이다
 * * (retur을 생략해도 암묵적으로 Unit 타입의 객체를 return하고 있다고 보면 된다. 싱글톤 인스턴스라 매번 객체 생성은 하지 않음)
 *
 */