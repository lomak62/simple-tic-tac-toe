fun main() {
    // write your code here
    val (s1, op, s2) = readln().split(" ")
    val a = s1.toLong()
    val b = s2.toLong()
    var resultMsg: Long = 0
    var errorMsg = ""

    when {
        op == "/" && b == 0L -> errorMsg = "Division by 0!"
        op !in "+-/*" -> errorMsg = "Unknown operator"
        op == "+" -> resultMsg = a + b
        op == "-" -> resultMsg = a - b
        op == "/" -> resultMsg = a / b
        op == "*" -> resultMsg = a * b
    }
    println(if (errorMsg.isEmpty()) resultMsg else errorMsg)
}