fun ABC094_B() {
    val (n, m, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    var right = 0
    var left = 0
    for (stop in a) {
        if (stop < x) {
            left++
        } else {
            right++
        }
    }
    println(if (left < right) left else right)
}
