fun ABC112_B() {
    val (n, t) = readLine()!!.split(" ").map { it.toInt() }
    val roots = (1..n).map { readLine()!!.split(" ").map { it.toInt() } }
    val cost  = roots.filter { it[1] <= t }
    val ans = if (cost.isEmpty()) {
        "TLE"
    } else {
        cost.minBy { it[0] }!![0].toString()
    }
    println(ans)
}
