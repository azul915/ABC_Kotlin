fun ABC027_A() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    val other = list.groupBy { it }.minByOrNull { it.value.size }!!.key
    println(other)
}