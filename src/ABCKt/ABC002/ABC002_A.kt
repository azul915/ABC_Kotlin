package ABCKt.ABC002

fun ABC002_A() {
    val bigger = readLine()!!.split(" ").map { it.toInt() }.max()!!
    println(bigger)
}