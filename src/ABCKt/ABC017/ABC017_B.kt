fun ABC017_B() {
    var ca = readLine()!!
    val list = mutableListOf("ch","o","k","u")

    for (i in 0..3) {
        ca = ca.replace(list[i], "")
        if (ca == "") {
            println("YES")
            return
        }
    }
    println("NO")
}