fun ABC029_B() {
    val list = (1..12).map { readLine()!! }
    println(list.filter { it.contains("s") }.count())
}
