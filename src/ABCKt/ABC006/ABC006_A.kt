fun ABC006_A() {
    val n = readLine()!!.toInt()
    val result = when {
        n % 3 == 0 -> "YES"
        n.toString().contains("3") -> "YES"
        else -> "NO"
    }
    println(result)
}