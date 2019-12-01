fun ABC006_B() {

    val n = readLine()!!.toInt()
    val tri: IntArray = IntArray(n)

    val an = when {
        n <= 2 -> 0
        n == 3 -> 1
        else -> {
            tri[1] = 0
            tri[2] = 0
            tri[3] = 1
            for (i in 4..n) {
                tri[n] = (tri[n - 3] + tri[n - 2] + tri[n - 1]) % 10007
            }
        }
    }
    println(an)
}