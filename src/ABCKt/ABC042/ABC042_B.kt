fun ABC042_B () {
    val (n, l) = readLine()!!.split(" ").map { it.toInt() }
    val s = (1..n).map { readLine()!! }
    val result = s.sorted().joinToString("")
    println(result)
}
