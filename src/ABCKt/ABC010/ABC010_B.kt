fun ABC010_B() {
    val map
            = mutableMapOf<Int, Int>(1 to 0,
                                     2 to 1,
                                     3 to 0,
                                     4 to 1,
                                     5 to 2,
                                     6 to 3,
                                     7 to 0,
                                     8 to 1,
                                     9 to 0)
    readLine()!!
    val list = readLine()!!.split(" ").map { it.toInt() }
    list.map { map[it]!! }.sum().apply { println(this) }
}