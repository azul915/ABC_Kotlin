fun ABC016_B() {
    val (A,B, C) = readLine()!!.split(" ").map { it.toInt() }
    val result = when {
        A + B == C && A - B == C -> "?"
        A + B == C -> "+"
        A - B == C -> "-"
        else -> "!"
    }
    println(result)
}

