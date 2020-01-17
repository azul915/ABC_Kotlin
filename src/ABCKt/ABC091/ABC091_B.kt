fun ABC092_B() {
    val n = readLine()!!.toInt()
    val blues = (1..n).map { readLine()!! }
    val m = readLine()!!.toInt()
    val reds = (1..m).map { readLine()!! }

    val kinds = blues.distinct()

    var plus = 0
    var minus = 0
    var result = 0
    for (kind in kinds) {
        plus = blues.count { it == kind }
        minus = reds.count { it == kind }
        if (plus - minus > result) { result = plus - minus }
    }

    println(result)
}
