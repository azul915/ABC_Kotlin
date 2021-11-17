//fun main(args: Array<String>) {
//    val N = readLine()!!.toInt()
//    val result = when(N) {
//        in 0..59  -> "Bad"
//        in 60..89 -> "Good"
//        in 90..99 -> "Great"
//        else -> "Perfect"
//    }
//    println(result)
//}
fun ABC028() {
    val N = readLine()!!.toInt()
    val result = when(N) {
        in 0..59  -> "Bad"
        in 60..89 -> "Good"
        in 90..99 -> "Great"
        else -> "Perfect"
    }
    println(result)
}