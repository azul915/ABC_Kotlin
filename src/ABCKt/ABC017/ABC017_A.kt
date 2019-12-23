fun ABC017_A() {
    val (s1, e1) = readLine()!!.split(" ").map { it.toInt() }
    val (s2, e2) = readLine()!!.split(" ").map { it.toInt() }
    val (s3, e3) = readLine()!!.split(" ").map { it.toInt() }
    println((0.1 * (s1 * e1 + s2 * e2 + s3 * e3)).toInt())
}