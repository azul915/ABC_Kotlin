fun ABC024_B() {
    val (n, t) = readLine()!!.split(" ").map { it.toInt() }
    val list = (1..n).map { readLine()!!.toInt() }
    var time = 0
    for(i in list.indices) {
        if (i > 0) {
            val diff = list[i] - list[i-1]
            time += if (diff > t) {
                t
            } else {
                diff
            }
        }
    }
    time += t
    println(time)
}
