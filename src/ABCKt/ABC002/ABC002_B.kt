fun ABC002_B() {
    val w = readLine()!!
    val removed = w.replace("[aiueo]".toRegex(), "")
    println(removed)
}