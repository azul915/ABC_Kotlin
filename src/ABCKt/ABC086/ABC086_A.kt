fun ABC086_A() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(if(a * b % 2 != 0) "Odd" else "Even")
}