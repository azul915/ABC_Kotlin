fun ABC153_B() {
    val (h, n) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toInt() }
    val desc = list.sortedDescending()

    var sum = 0
    for (atack in desc) {
        sum += atack
        if (sum >= h) {
            println("Yes")
            return
        }
    }
    println("No")
}
