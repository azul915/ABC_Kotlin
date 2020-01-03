fun ABC023() {
    val X = readLine()!!
    val sum = X.map { it.toString().toInt() }.sum()
    println(sum)
}