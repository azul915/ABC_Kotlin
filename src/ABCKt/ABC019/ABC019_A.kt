fun ABC019_A() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    list.sorted().elementAt(1).apply { println(this) }
}