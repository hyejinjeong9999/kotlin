package part2

class Product {
    var name: String = ""
    var price: Int = 0
}

fun main(args: Array<String>) {
    val product: Product;product = createProduct()
    printProductInfo(product)
    processProduct(product)
    printProductInfo(product)
}

fun processProduct(product: Product) {
    product.price += 500
}

fun printProductInfo(product: Product) {
    println("이름 : ${product.name}")
    println("가격 : ${product.price}")
}

fun createProduct(): Product {
    val apple = Product()
    apple.name = "Apple"
    apple.price = 1000
    return apple;
}
/**
 * Product 타입의 값을 반환하는 함수를 호출하고 그 결과를 product 참조변수에 저장하고 있다.
 * createProduct
 *   -Product의 인스턴스를 생성
 *   -apple 참조변수에 그 위치를 저장
 *   -apple 참조변수가 가르키는 객체의 프로퍼티에 값을 채워넣음 (Apple, 1000)
 *   -return
 * createProduct 함수는 스택에서 지워지지만 apple 참조변수가 가르키던 객체는 힙에서 지워지지 않는다
 * (힙 영역에 생성한 변수는 지워지지 않는다)
 * product에 apple이 가지고 있던 참조값이 저장된다 (Apple, 1000)
 * printProductInfo
 *   - product의 참조값을 전달함
 *   - 출력
 * processProduct
 *   -전달받은 참조값(apple,1000)을 매개변수 product에 저장
 *   -매개변수가 가르키고 있는 price를 수정한다 (Apple, 1500)
 *
 *
 * 즉 힙이라는 공간으로 하나의 객체를 여러 참조변수에서 공유하는 형태로 사용할 수 있어서 훨씬 메모리공간을 절약 할 수 있다
 */



