fun ABC126() {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val S = readLine()!!
    S.withIndex()
        .map { if(it.index == K -1) { it.value.toLowerCase() } else { it.value } }
        .forEach { print(it) }
}

