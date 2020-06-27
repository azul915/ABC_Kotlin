fun main(args: Array<String>) {
    val input = readLine()!!.toCharArray()[0]
    val result = if (input in 'A'..'Z') {
        "A"
    } else {
        "a"
    }
    println(result)
}
