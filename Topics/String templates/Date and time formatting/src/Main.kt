fun main() {
    // write your code here
    val(a, b, c) = readln().split(" ")
    val(d, e, f) = readln().split(" ")

    val timeDate: String = "$a:$b:$c $d/$e/$f"
    println(timeDate)
}