fun main() {
    // write your code here
    val numOfElements = readln().toInt()
    val listOfElements = mutableListOf<Int>()

    for (n in 1..numOfElements) {
        listOfElements.add(readln().toInt())
    }

    println(listOfElements.indexOf(listOfElements.maxOrNull()))
}