import kotlin.math.max

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    println(max(input[0]+input[3]+input[4], input[1]+input[2]+input[4]))
}