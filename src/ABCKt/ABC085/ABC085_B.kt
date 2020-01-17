fun ABC085_B() {
    val n = readLine()!!.toInt()
    val mochi = (1..n).map { readLine()!!.toInt() }
    println(mochi.distinct().count())
}
