fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line
    // enter your code
    val secondsInMinute = 60
    val secondsInHour = 60 * secondsInMinute
    val secondsInDay = 24 * secondsInHour

    // val days = totalSeconds / secondsInDay
    val remainingSeconds = totalSeconds % secondsInDay

    val hours = remainingSeconds / secondsInHour
    val remainingSecondsAfterHours = remainingSeconds % secondsInHour

    val minutes = remainingSecondsAfterHours / secondsInMinute
    val seconds = remainingSecondsAfterHours % secondsInMinute

    // val currentTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    val currentTime = hours.toString() + ":" + minutes.toString() + ":" + seconds.toString()
    println(currentTime)
}