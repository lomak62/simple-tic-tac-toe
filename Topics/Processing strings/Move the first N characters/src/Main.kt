fun main() {
    // write your code here
    val (s, n) = readln().split(" ")
    println(if (n.toInt() >= s.length) s else s.substring(n.toInt()) + s.substring(0, n.toInt()))
}