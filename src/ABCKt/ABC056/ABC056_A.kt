fun ABC056_A() {
    val (a, b) = readLine()!!.split(" ")

    val result = if (a == "H") {
        if (b == "H") {
            "H"
        } else {
            "D"
        }
    } else {
        if (b == "H") {
            "D"
        } else {
            "H"
        }
    }
    println(result)

}
