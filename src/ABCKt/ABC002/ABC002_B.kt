fun ABC002_B() {
    val w = readLine()!!
    val removed = w.filterNot { it in listOf('a', 'i', 'u', 'e', 'o') }
    println(removed)
}