fun ABC123_A() {
    val list = (1..5).map { readLine()!!.toInt() }
    val k = readLine()!!.toInt()

    for (i in 0..3) {
        for (j in (i + 1)..4) {
           if (list[j] - list[i] > k) {
               println(":(")
               return
           }
        }
    }

    println("Yay!")
}
