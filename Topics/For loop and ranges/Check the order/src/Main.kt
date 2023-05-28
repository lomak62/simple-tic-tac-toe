fun main() {
    // write your code here
    var result = "YES"
    var userInput = 0
    var lastInput = 0
    val n = readln().toInt()
    for (i in 1..n) {
        userInput = readln().toInt()
        if (userInput < lastInput) { result = "NO" }
        lastInput = userInput
    }
    println(result)
}