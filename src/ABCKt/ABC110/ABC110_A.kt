fun ABC110_A() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    val str = list.sortedDescending().joinToString("")
    val left = str.substring(0..1).toInt()
    val right = str.substring(2).toInt()
    println(left + right)
}
