fun ABC077_B() {
    val n = readLine()!!.toInt()
    var num = 0
    var pow = 0
    var cur: Int
    while (true) {
        num++
        cur = pow
        pow = num * num
        if (pow > n) break
    }
    println(cur)
}
