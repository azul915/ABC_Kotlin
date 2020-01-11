fun ABC031_A() {
    val (a, d) = readLine()!!.split(" ").map { it.toInt() }
    val upa = (a + 1) * d
    val upd = a * (d + 1)
    val pow = when {
        upa >= upd -> upa
        else -> upd
    }
    println(pow)
}
