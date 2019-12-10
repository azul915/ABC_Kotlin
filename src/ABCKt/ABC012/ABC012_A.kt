fun ABC012_A() {
    val (first, second) = readLine()!!.split(" ").run { IntArray(2) { get(it).toInt() }}
    println("${second} ${first}")
}