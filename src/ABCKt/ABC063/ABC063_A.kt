fun ABC063_A() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    (a + b).apply { if (this >= 10) println("error") else println(this) }
}
