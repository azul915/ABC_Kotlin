fun ABC014_B() {
    val (n, X) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toInt() }
    var sum = 0
    for (i in 0 until n) {
        val num = (X shr i) % 2
        if (num == 1) sum += list[i]
    }
    println(sum)
}