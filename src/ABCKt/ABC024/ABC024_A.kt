fun ABC024_A() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    val a = list[0]
    val b = list[1]
    val c = list[2]
    val k = list[3]
    val (s, t) = readLine()!!.split(" ").map { it.toInt() }

    val sum =
        if (s + t >= k) {
            (a - c) * s + (b - c) * t
        } else {
            a * s + b * t
        }
    println(sum)
}