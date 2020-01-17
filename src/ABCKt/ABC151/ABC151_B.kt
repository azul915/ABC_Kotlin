fun ABC151_B() {
    val (n, k, m) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toInt() }
    val max = m * n - list.sum()
    val result = when {
        max < 0 -> 0
        max <= k -> max
        else -> -1
    }
    println(result)
}
