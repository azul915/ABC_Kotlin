fun main(args: Array<String>) {

    val a = readLine()!!.toInt()

    val result = if (a % 2 == 0) {
        (a / 2) * (a / 2)
    } else {
        ((a - 1) / 2) * (((a - 1) / 2) +1)
    }
    println(result)

}