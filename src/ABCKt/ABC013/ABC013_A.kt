fun ABC013_A() {
    val str = readLine()!!
    val output = when(str) {
        "A" -> 1
        "B" -> 2
        "C" -> 3
        "D" -> 4
        else -> 5
    }
    println(output)
}