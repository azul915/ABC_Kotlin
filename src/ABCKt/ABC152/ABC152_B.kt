fun ABC152_B() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val aNum = (1..b).map { a }.joinToString("").toInt()
    val bNum = (1..a).map { b }.joinToString("").toInt()
    println(if(aNum <= bNum) aNum else bNum)
}
