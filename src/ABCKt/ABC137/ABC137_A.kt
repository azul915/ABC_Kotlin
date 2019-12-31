fun ABC137_A() {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    val summation = A + B
    val difference = A - B
    val product = A * B
    println(mutableListOf(summation, difference, product).max())
}