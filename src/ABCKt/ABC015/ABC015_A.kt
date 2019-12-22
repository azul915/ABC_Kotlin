fun ABC015_A() {
    val longer = (1..2).map { readLine()!! }.maxBy { it.length }!!
    println(longer)
}