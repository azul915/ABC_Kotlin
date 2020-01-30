fun ABC039_B() {
    val n = readLine()!!.toInt()
    var num = 0
    while (true) {
        num++
        if (num * num * num * num == n) break
    }
    println(num)
}
