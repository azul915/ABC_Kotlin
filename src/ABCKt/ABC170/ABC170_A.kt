fun main(args: Array<String>) {
    val list = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0..4) {
        if (list[i] == 0) {
            println(i + 1)
            return
        }
    }
}
