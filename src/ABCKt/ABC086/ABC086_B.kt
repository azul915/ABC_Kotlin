fun ABC086_B() {

    val prod = readLine()!!.replace(" ", "").toInt()
    var num = 0
    var pow = 0
    while (pow < prod) {
        pow = num * num
        if (pow == prod) {
            println("Yes")
            return
        }
        num++
    }

    println("No")

}
