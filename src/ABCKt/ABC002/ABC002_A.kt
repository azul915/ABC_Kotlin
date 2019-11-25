package ABCKt.ABC002

fun ABC002_A() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    if (x > y) println(x) else println(y)
}