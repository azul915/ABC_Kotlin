fun ABC023_B() {
    val len = readLine()!!.toInt()
    val str = readLine()!!

    val k = len / 2
    var p = "b"

    for (i in 1..k) {
        when (i % 3) {
            0 -> p = "b${p}b"
            1 -> p = "a${p}c"
            2 -> p = "c${p}a"
        }
    }
}
