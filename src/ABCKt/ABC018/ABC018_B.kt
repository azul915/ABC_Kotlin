// TODO: immutableにする
fun ABC018_B() {
    var S = readLine()!!
    val N = readLine()!!.toInt()
    var lr: List<Int>
    for(i in 1..N) {
        lr = readLine()!!.split(" ").map { it.toInt() }
        S = S.substring(0, lr[0] -1) + S.substring(lr[0] -1, lr[1]).toCharArray().reversed().joinToString("") + S.substring(lr[1], S.length)
    }
    println(S)
}