fun ABC052_A() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    println(listOf(list[0]*list[1], list[2]*list[3]).max())
}
