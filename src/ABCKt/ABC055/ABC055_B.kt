fun ABC055_B() {
    val n = readLine()!!.toInt()
    var result: Long = 1
    for (coefficient in 1..n) {
        result = (coefficient * result) % 1000000007
    }
    println(result)
}
