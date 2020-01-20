fun ABC118_B() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val line = (1..n).map { readLine()!!.split(" ")
        .map { it.toInt() }
        .filterIndexed { index, i -> index > 0 }}
        .flatten()
    val ans = line.groupBy { it }
        .filter { it.value.size == n }
        .count()
    println(ans)
}
