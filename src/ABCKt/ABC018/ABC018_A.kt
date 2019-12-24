fun ABC018_A() {
    val input = (1..3).map { readLine()!!.toInt() }
    val sortedDesc = input.sortedDescending()
    input.map { sortedDesc.indexOf(it) + 1 }.forEach { println(it) }
}
