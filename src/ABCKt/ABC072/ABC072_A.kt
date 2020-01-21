fun ABC072_A() {
    val (x, t) = readLine()!!.split(" ").map { it.toInt() }
    println(if (x <= t) 0 else x - t)
}
