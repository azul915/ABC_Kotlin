fun ABC037_B() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    var ans = IntArray(n) { 0 }
    val lrt = (1..q).map { readLine()!!.split(" ").map { it.toInt() } }

    for (i in lrt) {
        for (j in ans.indices) {
            if (j in i[0]-1..i[1]-1) {
                ans[j] = i[2]
            }
        }
    }
    ans.forEach { println(it) }
}
