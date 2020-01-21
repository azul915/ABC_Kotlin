fun ABC058_A(){
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    println(if (b - a == c - b) "YES" else "NO")
}
