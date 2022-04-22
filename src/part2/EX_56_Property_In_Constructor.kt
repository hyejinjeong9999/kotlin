package part2

class Car(val name: String, val speed: Int = 0)

fun main(args: Array<String>) {
    val car = Car("MyCar")
    println(car.name)
    print(car.speed)
}
/**
 * 생성자와 프로퍼티를 한번에 쓸 수 있다
 * 생성자 매개변수 앞에 var/val 을 사용하면 동일한 이름의 프로퍼티가 같이 선언되면서 생성자 매개변수에 들어온 인수가 프로퍼티의 초기값이 된다
 *
 */

