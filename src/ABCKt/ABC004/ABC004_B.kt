fun ABC004_B() {
    val box: List<List<String>> = (0..3).map { readLine()!!.split(" ") }
    val reversed: List<List<String>> = box.map { it.reversed() }.reversed()
    reversed.map { it.joinToString(" ") }.forEach { println(it) }
}