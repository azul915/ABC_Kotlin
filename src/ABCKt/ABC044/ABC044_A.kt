fun ABC044_A() {
    val (n, k) = (1..2).map { readLine()!!.toInt() }
    val (x, y) = (1..2).map { readLine()!!.toInt() }
    val price = if (n <= k) {
        x * n
    } else {
        x * k + y * (n - k)
    }
    println(price)
}
