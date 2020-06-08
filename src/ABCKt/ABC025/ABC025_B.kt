fun ABC025_B() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    var point = 0
    for (i in 1..n) {
        val step = readLine()!!.split(" ")
        val d = Integer.parseInt(step[1]!!)
        if (d < a) {
            if (step[0] == "West") {
                point -= a
            } else {
                point += a
            }
        } else if (d in a..b) {
            if (step[0] == "West") {
                point -= d
            } else {
                point += d
            }
        } else {
            if (step[0] == "West") {
                point -= b
            } else {
                point += b
            }
        }
    }
    val result = when {
       point < 0 -> "West ${Math.abs(point)}"
        point == 0 -> point
        else -> "East $point"
    }
    println(result)
}
