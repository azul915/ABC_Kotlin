fun ABC008_A() {
    val (S, T) = readLine()!!.split(" ").map { it.toInt() }
    println(T - S + 1)
}