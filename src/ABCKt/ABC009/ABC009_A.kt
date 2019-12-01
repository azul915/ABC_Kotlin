fun ABC009_A() {
    val input = readLine()!!.toInt()
    val num = if(input % 2 == 1) input / 2 + 1 else input / 2
    println(num)
}