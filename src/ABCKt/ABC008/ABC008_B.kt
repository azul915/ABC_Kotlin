fun ABC008_B() {
    val N = readLine()!!.toInt()
    val S = (1..N).map { readLine()!! }
    val winner = S.groupBy { it }.values.maxBy { it.size }!!.first()
    println(winner)
}
