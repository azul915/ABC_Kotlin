fun ABC115_B () {
    val n = readLine()!!.toInt()
    val p = (1..n).map { readLine()!!.toInt() }
    val desc = p.sortedDescending()
    val sum = desc.first() / 2 + desc.filterIndexed { index, _ -> index > 0 }.sum()
    println(sum)
}
