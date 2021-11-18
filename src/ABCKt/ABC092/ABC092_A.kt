fun ABC092_A() {
    val train = (1..2).map { readLine()!!.toInt() }
    val bus = (1..2).map { readLine()!!.toInt() }
    println(train.minOrNull()!! + bus.minOrNull()!!)
}
