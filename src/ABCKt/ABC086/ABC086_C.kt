fun ABC086_C() {
    val n = readLine()!!.toInt()
    val plans = (1..n).map { readLine()!!.split(" ").map { it.toInt() } }
    var diff = 0
    var nextX = 0
    var nextY = 0
    for (plan in plans) {
        diff = plan[0] - diff
        nextX = plan[1] - nextX
        nextY = plan[2] - nextY
        val dist = Math.abs(nextX) + Math.abs(nextY)
        if (diff < dist) {
            println("No")
            return
        } else {
            if ((diff - dist) % 2 != 0) {
                println("No")
                return
            }
        }
    }
    println("Yes")
}
