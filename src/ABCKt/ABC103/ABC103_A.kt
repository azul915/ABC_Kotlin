fun ABC103_A() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    println(list.maxOrNull()!! - list.minOrNull()!!)
}
