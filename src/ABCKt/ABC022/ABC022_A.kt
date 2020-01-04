// TODO: immutableにする
fun ABC022_A() {
    val (n, s, t) = readLine()!!.split(" ").map { it.toInt() }
    var weight = 0
    var day = 0
    for (i in 1..n) {
        weight += readLine()!!.toInt()
        if(weight in s..t) {
            day++
        }
    }
    println(day)

}