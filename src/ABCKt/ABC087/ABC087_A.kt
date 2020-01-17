fun ABC087_A() {
    val (x, a, b) = (1..3).map { readLine()!!.toInt() }
    val afterBoughtCake = x - a
    var change = afterBoughtCake
    while (change >= b) { change -= b }
    println(change)
}
