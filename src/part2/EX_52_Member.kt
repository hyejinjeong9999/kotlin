package part2

class Building {
    var name = ""
    var date = ""
    var area = 0

    fun print() {
        println("이름 + ${this.name}")
        println("건축일자 + ${this.date}")
        println("면적 + ${this.area}")
    }
}

fun main(args: Array<String>) {
    var building = Building()
    building.name = "A오피스텔"
    building.date = "2017-12-13"
    building.area = 120 * 8

    building.print()
}

/**
 * Building 클래스 안에 print 함수가 내장되어 있다 = 멤버 함수
 *
 * this building 참조변수가 가르키는 객체로 치환됨
 * this는 생략가능하다
 */



