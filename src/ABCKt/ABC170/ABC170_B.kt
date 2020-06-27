fun main() {
    val list = readLine()!!.split(" ").map { it.toInt() }
    if ((2 * list[0] - list[1]) % 2 != 0 || 4 * list[0] < list[1] || 2 * list[0] > list[1]) {
        println("No")
        return
    } else {
        val b = (2 * list[0] - list[1]) / 2
        if (list[0] - b < 0) {
            println("No")
            return
        }
    }
    println("Yes")

}
