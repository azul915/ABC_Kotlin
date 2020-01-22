fun ABC115_A() {
    val d = readLine()!!.toInt()
    print("Christmas")
    println((0..24 - d).joinToString("") { " Eve" })
}
