fun main(Args: Array<String>): Unit {
    //15와 7을 비트 단위로 and 연산
    println(15 and 7)       //15 & 7
    //5와 2를 비트단위로 or 연산
    println(5 or 2)        //5|2
    //15와 5를 비트 단위로 xor 연산
    println(15 xor 5)      //15^5
    //32767을 비트단위로 반전
    println(32767.inv())    //~32767
    //1을 왼쪽으로 3칸 시프트
    println(1 shl 3)        //1<<3
    //8을 오른쪽으로 한칸 시프트
    println(8 shr 1)        //8>>1
    //부호를 유지한 채 -17을 오른쪽으로 2칸 시프트
    println(-17 ushr 2)     //-17>>>2

}
