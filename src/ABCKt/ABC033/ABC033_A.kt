fun ABC033_A() {
    val intList = readLine()!!.toCharArray().map { it.toInt() }
    val result = if (intList.any { it != intList.first() }) "DIFFERENT" else "SAME"
    println(result)
}
