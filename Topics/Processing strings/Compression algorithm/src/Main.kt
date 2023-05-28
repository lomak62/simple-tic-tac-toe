fun main() {
    // write your code here
    val seq = readln()
    var newSeq = ""
    var nextChr = seq.first()
    var count = 0

    for (i in 0..seq.lastIndex) {
        if (seq[i] == nextChr) {
            count += 1
        } else {
            newSeq += nextChr + count.toString()
            nextChr = seq[i]
            count = 1
        }
        if (i == seq.lastIndex) newSeq += seq.last() + count.toString()
    }
    println(newSeq)
}