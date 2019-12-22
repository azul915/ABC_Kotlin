fun ABC014_A() {
    val (a, b) = (1..2).map { readLine()!!.toInt() }
    val result = if (a % b != 0) b - (a % b) else 0
    println(result)
}