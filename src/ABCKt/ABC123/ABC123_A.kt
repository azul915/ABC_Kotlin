fun ABC123_A() {
    val list = (1..5).map { readLine()!!.toInt() }
    val k = readLine()!!.toInt()
    println(if (list[4] - list[0] <= k) "Yay!" else ":(")
}

//a < b < c < d < eなので、一番距離があるaとeがk以下なら全てのアンテナが相互通信できる

//fun ABC123_A() {
//    val list = (1..5).map { readLine()!!.toInt() }
//    val k = readLine()!!.toInt()
//
//    for (i in 0..3) {
//        for (j in (i + 1)..4) {
//           if (list[j] - list[i] > k) {
//               println(":(")
//               return
//           }
//        }
//    }
//
//    println("Yay!")
//}
