fun ABC015_A() {
    val longer = (1..2).map { readLine()!! }.maxByOrNull { it.length }!!
    println(longer)
}