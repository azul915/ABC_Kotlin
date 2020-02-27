fun ABC036_A() {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }
    var num = 0
    var current = 0
    while (current < b) {
        current += a
        num++
    }
    println(num)
}
