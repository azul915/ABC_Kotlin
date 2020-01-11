fun ABC030_A() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    val t = list[1].toDouble() / list[0].toDouble()
    val a = list[3].toDouble() / list[2].toDouble()
    val result = when {
        t > a -> "TAKAHASHI"
        a > t -> "AOKI"
        else -> "DRAW"
    }
    println(result)
}
