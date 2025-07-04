fun main() {
    reverseNum()
}

fun reverseNum() {
    var n = 1234
    var revNum = 0
    while (n != 0){
        val rem = n % 10

        revNum = revNum * 10 + rem
        n /= 10
    }

    println("RevNum: $revNum")
}
