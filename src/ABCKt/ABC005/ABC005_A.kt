fun ABC005_A() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val result = if (y/x > 0) y/x else 0
    println(result)
}