fun ABC068_B() {
    val n = readLine()!!.toInt()
    var t = 1

    while (t <= n) {
        if (t * 2 > n) {
            break
        } else {
            t *= 2
        }
    }
    println(t)
}
