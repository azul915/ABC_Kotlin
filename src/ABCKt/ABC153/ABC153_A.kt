fun ABC153_A() {
    val (h, a) = readLine()!!.split(" ").map { it.toInt() }
    var H = h
    var count = 0
    while (H > 0) {
        H -= a
        count++
    }
    println(count)
}
