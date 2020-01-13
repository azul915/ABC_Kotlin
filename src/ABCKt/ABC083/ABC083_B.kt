fun ABC083_B() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    val sum = (1..n).filter { it.toString().toCharArray().map { it.toString().toInt() }.sum() in a..b }.sum()
    println(sum)
}
