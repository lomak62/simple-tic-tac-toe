fun main() {
    // put your code here
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val input = readln()
    var output = ""

    for (i in alphabet) {
        if (input.contains(i)) continue
        output += i
    }
    println(output)
}