package part2

import java.text.FieldPosition

class Person4(var name: String, var birthday: String) {

    operator fun get(position: Int): String {
        return when (position) {
            0 -> name
            1 -> birthday
            else -> "알 수 없음"
        }

    }

    operator fun set(position: Int, value: String) {
        when (position) {
            0 -> name = value
            1 -> birthday = value
        }

    }
}


    fun main(args: Array<String>) {

    val person = Person4("Kotlin","2016-02-15")
        println(person[0])
        println(person[1])
        println(person[-1])

        person[0] = "JAVA"
        println(person.name)

    }

/**
 * 여러개의 피연산자를 지정할 수 있다
 * person[1,2,3] => person.get(1,2,3)
 * person[1,2] = "J" => pserson.set(1,2,"J)
 */
