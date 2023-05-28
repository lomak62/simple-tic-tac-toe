fun main() {
    // write your code here
    val input = readln()
    val vowels = "aeiouy"
    var countVowels = 0
    var countConsonants = 0
    var addChr = 0

    for (ch in input) {
        if (ch in vowels) {
            countConsonants = 0
            countVowels += 1
            if (countVowels == 3) {
                addChr++
                countVowels = 1
            }
        } else {
            countVowels = 0
            countConsonants += 1
            if (countConsonants == 3) {
                addChr++
                countConsonants = 1
            }
        }
    }
    println(addChr)
}