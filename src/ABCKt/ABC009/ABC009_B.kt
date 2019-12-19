fun ABC009_B() {
    val set = (1..readLine()!!.toInt()).map { readLine()!!.toInt() }.toSet()
    set.sortedDescending().apply { println(this[1]) }
}