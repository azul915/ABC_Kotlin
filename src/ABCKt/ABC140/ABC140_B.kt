fun ABC140_B() {
    readLine()!!
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.split(" ").map { it.toInt() }

    val result = a.withIndex().map {
        b[it.value - 1] +
            if (it.index > 0)
                if (it.value - a[it.index - 1] == 1) c[it.value - 2]
                else 0
            else 0
        }.sum()

    println(result)
}