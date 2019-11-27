fun ABC004_B() {
    val box = (0..3).map { readLine()!!.split(" ") }
    val reversed = box.map { it.reversed() }.reversed()
    reversed.map { it.joinToString(" ") }.forEach { println(it) }
}
