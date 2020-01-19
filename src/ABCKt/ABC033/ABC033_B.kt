fun ABC033_B() {
    val n = readLine()!!.toInt()
    var map = mutableMapOf<String, Int>()
    for (line in 1..n) {
        val (k, v) = readLine()!!.split(" ")
        map[k] = v.toInt()
    }
    val half = map.values.sum() /2

    val ans = map.filter { it.value > half }

    if (ans.isEmpty()) {
        println("atcoder")
    } else {
        println(ans.maxBy { it.value }!!.key)
    }
}
