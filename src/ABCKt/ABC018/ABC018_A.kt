fun ABC018_A() {
    val input = (1..3).map { readLine()!!.toInt() }
    val sortedDec = input.sortedDescending()
    input.map { sortedDec.indexOf(it) + 1 }.forEach { println(it) }
}
