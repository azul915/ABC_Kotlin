fun ABC013_B() {
    val (a, b) = (1..2).map { readLine()!!.toInt() }
    val abs = Math.abs(a - b)
    if(abs in 6..9) { 10 - abs } else { abs }.apply { println(this) }
}