fun reverseWord(word: String): String {
    var newWord = ""
    for (i in word.lastIndex downTo 0) {
        newWord += "${word[i]}"
    }
    return newWord
}

fun main() {
    // write your code here
    val word = readln()
    // println(if (word == word.reversed()) "yes" else "no")
    println(if (word == reverseWord(word)) "yes" else "no")
}