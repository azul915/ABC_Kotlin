import kotlin.math.nextUp

fun ABC015_B() {
    readLine()!!
    val bug = readLine()!!.split(" ").map { it.toInt() }.filterNot { it == 0 }
    val avg = bug.sum().toDouble() / bug.size
    val actual = Math.ceil(avg).toInt()
    println(actual)
}