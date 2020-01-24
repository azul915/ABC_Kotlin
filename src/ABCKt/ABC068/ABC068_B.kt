fun ABC068_B() {
    val n = readLine()!!.toInt()
    var t = 1
    while (t * 2 <= n) {
        t *= 2
    }
    println(t)
}
