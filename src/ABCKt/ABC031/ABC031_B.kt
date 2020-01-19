fun ABC031_B() {
    val (l, h) = readLine()!!.split(" ").map { it.toInt() }
    val n = readLine()!!.toInt()
    val a = (1..n).map { readLine()!!.toInt() }

    a.map {
        when {
            it < l -> l -it
            it in l..h -> 0
            else -> -1
        }
    }.forEach { println(it) }
}
