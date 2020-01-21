fun ABC076_A() {
    val (r, g) = readLine()!!.split(" ").map { it.toInt() }
    println(g + g - r)
}
