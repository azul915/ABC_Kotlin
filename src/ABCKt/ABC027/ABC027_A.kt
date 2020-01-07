fun ABC027_A() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    val other = list.groupBy { it }.minBy { it.value.size }!!.key
    println(other)
}