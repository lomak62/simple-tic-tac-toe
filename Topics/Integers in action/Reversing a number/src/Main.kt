import java.util.Scanner

fun main() {
    // put your code here
    val a = readln()

    val scanner = Scanner(a)
    scanner.useDelimiter("")
    val a1 = scanner.next()
    val a2 = scanner.next()
    val a3 = scanner.next()

    val b = (a3 + a2 + a1).toInt()
    println(b)
}