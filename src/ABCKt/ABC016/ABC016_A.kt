fun ABC016_A() {
    val (M, D) = readLine()!!.split(" ").map { it.toInt() }
    println(if(M % D == 0) "YES" else "NO")
}