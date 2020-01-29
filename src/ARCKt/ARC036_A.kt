fun ABC036_A() {
    val n = readLine()!!.toInt()
    // val zeros = "0".repeat(n - 1)
    val zeros = Array(n - 1) { 0 }.joinToString("")
    println("1${zeros}7")
}
