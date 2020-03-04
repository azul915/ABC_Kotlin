fun ABC034_A() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val res = if (x < y) "Better" else "Worse"
    println(res)
}
