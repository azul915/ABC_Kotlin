fun ABC079_A() {
    val n = readLine()!!
    val result = when {
        n[0] == n[1] && n[1] == n[2] -> "Yes"
        n[1] == n[2] && n[2] == n[3] -> "Yes"
        else -> "No"
    }
    println(result)
}
