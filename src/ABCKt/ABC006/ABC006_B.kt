fun ABC006_B() {

    val n = readLine()!!.toInt()
    val tri: IntArray = IntArray(n)

    val an = when {
        n == 3 -> 1
        n < 4 ->  0
        else -> {
            tri[0] = 0
            tri[1] = 0
            tri[2] = 1
            for(n in 3.until(n)) {
                tri[n] = (tri[n - 3] + tri[n - 2] + tri[n - 1]) % 10007
            }
            tri[n - 1]
        }
    }

    println(an)
}