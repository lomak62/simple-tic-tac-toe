package tictactoe
import kotlin.math.abs

fun emptyGrid(): String {

    return "---------\n" +
            "|       |\n" +
            "|       |\n" +
            "|       |\n" +
            "---------"
}

fun displayGrid(userInput: String): String {

    return "---------\n" +
            "| ${userInput[0]} ${userInput[1]} ${userInput[2]} |\n" +
            "| ${userInput[3]} ${userInput[4]} ${userInput[5]} |\n" +
            "| ${userInput[6]} ${userInput[7]} ${userInput[8]} |\n" +
            "---------"
}

fun gameState(userInput: String): String {
    var gameNotFinished = false
    var winnerX = false
    var winnerO = false
    var impossible = false
    var countX = 0
    var countO = 0

    for (ch in userInput) {
        if (ch == 'X') countX += 1
        if (ch == 'O') countO += 1
    }

    if (abs(countX - countO) >= 2) impossible = true

    val row1 = userInput.substring(0, 3)
    val row2 = userInput.substring(3, 6)
    val row3 = userInput.substring(6)

    val col1 = "${userInput[0]}${userInput[3]}${userInput[6]}"
    val col2 = "${userInput[1]}${userInput[4]}${userInput[7]}"
    val col3 = "${userInput[2]}${userInput[5]}${userInput[8]}"

    val dia1 = "${userInput[0]}${userInput[4]}${userInput[8]}"
    val dia2 = "${userInput[2]}${userInput[4]}${userInput[6]}"

    val rows = mutableListOf<String>()
    rows.add(row1)
    rows.add(row2)
    rows.add(row3)
    rows.add(col1)
    rows.add(col2)
    rows.add(col3)
    rows.add(dia1)
    rows.add(dia2)

    for (row in rows) {
        if ("_" in row) gameNotFinished = true
        if (row == "XXX") winnerX = true
        if (row == "OOO") winnerO = true
    }

    if (winnerX && winnerO) impossible = true

    return when {
        impossible -> "Impossible"
        winnerX -> "X wins"
        winnerO -> "O wins"
        gameNotFinished -> "Game not finished"
        else -> "Draw"
    }
}

fun userMove(s: String, x: String, y: String, player: String): String {
    var newGrid = ""

    if (x.toIntOrNull() == null || y.toIntOrNull() == null) {
        println("You should enter numbers!")
        return newGrid
    }

    if (!"123".contains(x) || !"123".contains(y)) {
        println("Coordinates should be from 1 to 3!")
        return newGrid
    }

    val rows = mutableListOf<MutableList<Int>>()

    var row1 = 1
    var col1 = 1
    for (ch in s) {
        if (ch == 'X' || ch == 'O') rows.add(mutableListOf(col1, row1))
        row1 += 1
        if (row1 == 4) {
            row1 = 1
            col1 += 1
        }
    }

    val cord = mutableListOf(x.toInt(), y.toInt())

    for (r in rows) {
        if (r == cord) {
            println("This cell is occupied! Choose another one!")
            return  newGrid
        }
    }

    var row2 = 1
    var col2 = 1
    for (ch in s) {
        if (col2 == x.toInt() && row2 == y.toInt()) newGrid += player else newGrid += ch
        row2 += 1
        if (row2 == 4) {
            row2 = 1
            col2 += 1
        }
    }
    return newGrid
}

fun main() {
    var userInput = "_________"
    var player = "X"

    println(emptyGrid())

    exit@ while (true) {
        print("> ")
        var x = ""
        var y = ""
        val input = readln()
        if (input.isNotBlank()) {
            val moves = input.split(" ", limit = 2)
            if (moves.getOrNull(0) != null) x = moves[0]
            if (moves.getOrNull(1) != null) y = moves[1]
            val newMove = userMove(userInput, x, y, player)
            if (newMove.isNotEmpty()) {
                println(displayGrid(newMove))
                if (gameState(newMove) == "Game not finished") {
                    userInput = newMove
                    player = if (player == "X") "O" else "X"
                } else {
                    println(gameState(newMove))
                    break@exit
                }
            }
        }
    }
}