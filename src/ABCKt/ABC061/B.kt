fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val arr = IntArray(n)
    for (i in 1..m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        arr[a-1]++
        arr[b-1]++
    }
    arr.forEach { println(it) }
}