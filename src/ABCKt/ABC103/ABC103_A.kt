fun ABC103_A() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    println(list.max()!! - list.min()!!)
}
