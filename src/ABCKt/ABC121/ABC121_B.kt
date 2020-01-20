fun ABC121_B() {
    val (n, m, c) = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    val a = (1..n).map { readLine()!!.split(" ").map { it.toInt() } }
    var count = 0
    var sum = 0
    for (value in a) {
        for (i in value.indices) {
            sum += value[i] * b[i]
        }
        sum += c
        if (sum > 0) count++
        sum = 0
    }

    println(count)

}
