fun ABC022_B() {
    val n =readLine()!!.toInt()
    val a = (1..n).map { readLine()!!.toInt() }
    val result = a.groupBy { it }
                        .filterValues { it.size > 1 }
                        .map { it.value.size -1 }
                        .sum()
    println(result)
}