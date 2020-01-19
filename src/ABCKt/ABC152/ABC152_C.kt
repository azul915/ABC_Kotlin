fun ABC152_C() {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    var min = 1000000000

    for (i in 0 until n) {
        min = if (min < p[i]) min else p[i]
        if (min == p[i]) ans++
    }
    println(ans)
}
