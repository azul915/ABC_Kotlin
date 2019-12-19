fun ABC137_B() {
    val (K, X) = readLine()!!.split(" ").map { it.toInt() }
    ((X - (K - 1))..(X + (K - 1))).forEach { print("${it} ") }
}