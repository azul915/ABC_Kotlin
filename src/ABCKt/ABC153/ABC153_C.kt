fun ABC153_C() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toLong() }
    val desc = list.sortedDescending()
    var count = 0

    if (desc.size <= k) {
        println(count)
        return
    }
    val remaining  = desc.drop(k)
    println(remaining.sum())


}
