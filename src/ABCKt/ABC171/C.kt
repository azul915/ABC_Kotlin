fun main(args: Array<String>) {
    var n = readLine()!!.toLong()
    val az = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
    var result = StringBuilder()

    while (n > 0) {
        val h = (n % 26).toInt()
        if (h == 0) {
            result.append(az[25])
            n--
        } else {
            result.append(az[h-1])
        }
        n /= 26
    }
    val output = result.split("").reversed().joinToString("")
    println(output)
}
