fun ABC073_B() {
    val n = readLine()!!.toInt()
    var sum = 0
    for (line in 1..n) {
        val list = readLine()!!.split(" ").map { it.toInt() }
        sum += list[1] - list[0] + 1
    }
    println(sum)
}
