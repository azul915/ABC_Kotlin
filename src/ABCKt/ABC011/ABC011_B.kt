fun ABC011_B() {
    val input = readLine()!!
    val name =
        input.toLowerCase().toCharArray().withIndex().map {
            if (it.index == 0) it.value.toUpperCase() else it.value }.joinToString("")
    println(name)
}