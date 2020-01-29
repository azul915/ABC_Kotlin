fun ABC121_A() {
    val (H, W) = readLine()!!.split(" ").map { it.toInt() }
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    println((H - h) * (W - w))
}
