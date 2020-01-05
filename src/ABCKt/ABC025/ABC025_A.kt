fun ABC025_A() {
    val str = readLine()!!.map { it.toString() }
    val n = readLine()!!.toInt()
    var num = 0
    for(i in str.indices) {
        for(j in str.indices) {
            num++
            if (num == n) {
                println("${str[i]}${str[j]}")
                return
            }
        }
    }
}